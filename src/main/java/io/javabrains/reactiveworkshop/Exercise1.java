package io.javabrains.reactiveworkshop;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        // TODO: Write code here
        StreamSources.intNumbersStream().forEach(num -> System.out.println(num));

        // Print numbers from intNumbersStream that are less than 5
        // TODO: Write code here
        StreamSources.intNumbersStream().filter(n -> n < 5).forEach(System.out::println);

        // Print the second and third numbers in intNumbersStream that's greater than 5
        // TODO: Write code here
        StreamSources.intNumbersStream()
                .filter(n -> n > 5)
                .skip(1)
                .limit(2)
                .forEach(System.out::println);

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        // TODO: Write code here
        Integer value = StreamSources.intNumbersStream()
                .filter(n -> n > 5)
                .findFirst()
                .orElse(-1);
        System.out.println(value);

        // Print first names of all users in userStream
        // TODO: Write code here
        StreamSources.userStream()
                .forEach(user -> System.out.println(user.getFirstName()));

        StreamSources.userStream()
                .map(user -> user.getFirstName())
                .forEach(username -> System.out.println(username));

        // Print first names in userStream for users that have IDs from number stream
        // TODO: Write code here
        StreamSources.userStream().filter(user ->
                        StreamSources.intNumbersStream().anyMatch(i -> i == user.getId()))
                .forEach(user -> System.out.println(user.getFirstName()));

        StreamSources.intNumbersStream()
                .flatMap(id -> StreamSources.userStream().filter(user -> user.getId() == id))//if  right hand side returning a stream instead of value use flatMap
                .map(user -> user.getFirstName())
                .forEach(name -> System.out.println(name));

    }

}

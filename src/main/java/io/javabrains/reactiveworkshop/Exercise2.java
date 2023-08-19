package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise2 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()

        // Print all numbers in the ReactiveSources.intNumbersFlux stream
        // TODO: Write code here
        ReactiveSources.intNumbersFlux().subscribe(e -> System.out.println(Thread.currentThread().getName() + "==>" + e));

        // Print all users in the ReactiveSources.userFlux stream
        // TODO: Write code here
        ReactiveSources.userFlux().subscribe(user -> System.out.println(Thread.currentThread().getName() + "==>" + user));

        System.out.println("Press a key to end");
        System.in.read();
    }

}
/**
 * Press a key to end
 * parallel-1==>1
 * parallel-2==>User{id=1, firstName='Lionel', lastName='Messi'}
 * parallel-3==>2
 * parallel-4==>User{id=2, firstName='Cristiano', lastName='Ronaldo'}
 * parallel-5==>3
 * parallel-6==>User{id=2, firstName='Diego', lastName='Maradona'}
 * parallel-7==>4
 * parallel-8==>User{id=4, firstName='Zinedine', lastName='Zidane'}
 * parallel-1==>5
 * parallel-2==>User{id=5, firstName='Jürgen', lastName='Klinsmann'}
 * parallel-3==>6
 * parallel-4==>User{id=6, firstName='Gareth', lastName='Bale'}
 * parallel-5==>7
 * parallel-6==>8
 * parallel-7==>9
 * parallel-8==>10
 */

package io.javabrains.reactiveworkshop;

import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;

import java.io.IOException;

public class Exercise5 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberFlux() and ReactiveSources.userFlux()

        // Subscribe to a flux using the error and completion hooks
        // TODO: Write code here
        ReactiveSources.intNumbersFlux().subscribe(
                num -> System.out.println(num),
                err -> System.out.println(err.getMessage()),
                () -> System.out.println("Completed")
        );

        ReactiveSources.userFlux().subscribe(
                user -> System.out.println(user),
                err -> System.out.println(err.getMessage()),
                () -> System.out.println("Completed")
        );
        // Subscribe to a flux using an implementation of BaseSubscriber
        // TODO: Write code here

        ReactiveSources.intNumbersFlux().subscribe(
                num -> System.out.println(num)
        );

        ReactiveSources.userFlux().subscribe(
                user -> System.out.println(user)
        );

        System.out.println("Press a key to end");
        System.in.read();
    }

}

class MySubscriber<T> extends BaseSubscriber<T> {
    public void hookOnSubscribe(Subscription subscription) {
        System.out.println("Subscription happend");
    }
}
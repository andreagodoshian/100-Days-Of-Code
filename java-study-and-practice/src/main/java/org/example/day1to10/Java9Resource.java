package org.example.day1to10;

public class Java9Resource implements AutoCloseable {

    Java9Resource() { // no-args constructor
        System.out.println("Creating the resource :)");
    }

    public void printHello() {
        System.out.println("Hello :)");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing the resource :)");
    }
}

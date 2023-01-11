package org.example.onetoten;

public class LambdaThreadDemo {

    public static void main(String[] args) {

        // Remember: "Runnable" is Functional by default
        Runnable r = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Child Thread");
            }
            System.out.println("Child is done");
        }; // "User" since in main

        Thread t = new Thread(r);
        t.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread");
        }
        System.out.println("Hejdå!");
    }
}
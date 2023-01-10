package org.example.onetoten;

// Source: https://www.youtube.com/watch?v=uRJj6S3WYP4&t=43s
public class DaemonDemo {

    public static void main(String[] args) {
        System.out.println("Start");

        Thread t1 = new Thread(() -> {
            int i = 0;
            while (true) {
                System.out.println("Iteration: " + i++);
            }
        });

        Thread t2 = new Thread(() -> {
            try{
                Thread.sleep(500);
            } catch (Exception e) {}
        });

        // play with true/false
        // (lol my computer is so fast, I need add a sleeper)
        t1.setDaemon(true);
        t1.start();
        t2.start();
        // LOL got to "Iteration: 110067" RIP
        System.out.println("End");
    }
}
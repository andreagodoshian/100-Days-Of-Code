package org.example.onetoten;

public class ThreadJoining extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <3; i++) {
            try {
                Thread.sleep(500);
                System.out.println("Current Thread: " +
                        Thread.currentThread().getName() +
                        " ~ Current Iteration: " + i);
            } catch (Exception e) {
                System.out.println("Exception @ Thread: " +
                        Thread.currentThread().getName());
            }
        }
    }
}
package org.example.day1to10;

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

/*
    public static void main( String[] args )
    {
        System.out.println( "Hej Världen!" );

        ThreadJoining t1 = new ThreadJoining();
        ThreadJoining t2 = new ThreadJoining();
        ThreadJoining t3 = new ThreadJoining();

        System.out.println("---------- with join() ----------");

        t1.start();
        try { t1.join(); }
        catch(Exception ex) {
            System.out.println("Exception has " +
                    "been caught" + ex);
        }

        System.out.println("---------- without join() ----------");
        t2.start();
        t3.start();
    }
*/
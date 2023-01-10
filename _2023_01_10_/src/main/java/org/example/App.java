package org.example;

import org.example.onetoten.ThreadJoining;

public class App
{
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
}

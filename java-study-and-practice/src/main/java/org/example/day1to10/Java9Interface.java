package org.example.day1to10;

public interface Java9Interface {

    public abstract void multiply(int a, int b);

    public default void accessingPrivate(int a, int b) {
        sub(a, b);
        div(a, b);
        System.out.print("Default method: " + a + " + " + b + " = ");
        System.out.println(a + b);
    }

    private void sub(int a, int b)
    {
        System.out.print("Private method: " + a + " - " + b + " = ");
        System.out.println(a - b);
    }

    private static void div(int a, int b)
    {
        System.out.print("Private static method: " + a + " / " + b + " = ");
        System.out.println(a / b);
    }
}
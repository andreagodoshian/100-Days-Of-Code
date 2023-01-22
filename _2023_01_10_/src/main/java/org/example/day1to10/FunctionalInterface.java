package org.example.day1to10;

@java.lang.FunctionalInterface
public interface FunctionalInterface {
    public void method(String text1, String text2);

    /*
    A functional interface in Java is an interface that contains
    only a single abstract (unimplemented) method.
    A functional interface can contain default and static methods
    (which do have an implementation),
    in addition to the single unimplemented method.
    */

    default public String getQuote() {
        return "The reason I talk to myself is because I'm the only one whose answers I accept.";
    }
}
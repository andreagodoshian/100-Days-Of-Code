package org.example.onetoten;

import lombok.Getter;
import java.util.Comparator;

@Getter
public class LambdaJava8 {

    // // Anonymous Implementation Before Java 8 // //
    Comparator<String> beforeComparator = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    };
    int beforeAnswer = beforeComparator.compare("Z", "A");

    // // Lambda Added In Java 8 // //
    Comparator<String> lambdaComparator = (String o1, String o2) -> {
        return o1.compareTo(o2);
    };
    int lambdaAnswer = lambdaComparator.compare("Z", "A");

    // // Java 8 has some type-inference, so we can simplify // //
    Comparator<String> simplerLambda = (o1, o2) -> o1.compareTo(o2);
    int simplerAnswer = simplerLambda.compare("Z", "A");

}

/*
public static void main( String[] args )
    {
        System.out.println( "Hej Världen!" );

        LambdaJava8 lambdaJava8 = new LambdaJava8();

        System.out.println("Before Lambda: " + lambdaJava8.getBeforeAnswer());
        System.out.println("With Lambda: " + lambdaJava8.getLambdaAnswer());
        System.out.println("Simple Lambda: " + lambdaJava8.getSimplerAnswer());

        System.out.println("------------------------");

        System.out.println("Lambdas And Functional Interfaces...");
        FunctionalInterface functionalInterface = (text1, text2) ->
                System.out.println("First: " + text1 + " " + text2);
        functionalInterface.method("Fold", "Five");
        FunctionalInterface functionalInterface2 = (text1, text2) ->
                System.out.println("Second: " + text1 + " " + text2);
        functionalInterface2.method("Bold", "Jive");

        System.out.println("** " + functionalInterface.getQuote());
    }
*/

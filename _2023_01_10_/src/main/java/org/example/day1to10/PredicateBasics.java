package org.example.day1to10;

import lombok.Getter;
import java.util.function.Predicate;

@Getter
public class PredicateBasics {
    Predicate<Integer> lessThan18 = i -> (i < 18);
    Predicate<Integer> greaterThan10 = (i) -> i > 10;

    ///////////////////////////////////////

    public void predAsParam(Predicate<Integer> predicate) {
        int[] array = {0, 10, 20, 30, 40, 50};
        for (int x:array) {
            if (predicate.test(x)) System.out.print(x + " ");
        }
    }

    //////////////////////////////////////

    // "Predicate Joining" - and(), or(), negate()
    public void predicateJoining() {
        System.out.println("Greater than 10 && Less than 18");
        predAsParam(greaterThan10.and(lessThan18));
        System.out.println("\nGreater than 10 || Less than 18");
        predAsParam(greaterThan10.or(lessThan18));
        System.out.println("\nNOT greater than 10");
        predAsParam(greaterThan10.negate());
    }
}

/*
    public static void main( String[] args ) {
        System.out.println("Hej Världen!");

        PredicateBasics predicateBasics = new PredicateBasics();

        System.out.println("Is 20>10? Is 20<18?");
        System.out.println(predicateBasics.getGreaterThan10().test(20));
        System.out.println(predicateBasics.getLessThan18().test(20));

        System.out.println("-------------------------");
        System.out.println("Predicate Joining");
        predicateBasics.predicateJoining();
    }
*/
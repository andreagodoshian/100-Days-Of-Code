package org.example.onetoten;

import lombok.Getter;
import java.util.function.Predicate;

@Getter
public class PredicateBasics {
    Predicate<Integer> lessThan18 = i -> (i < 18);
    Predicate<Integer> greaterThan10 = (i) -> i > 10;

    ///////////////////////////////////////

    boolean canChainPredicates = lessThan18.and(greaterThan10).test(15);

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
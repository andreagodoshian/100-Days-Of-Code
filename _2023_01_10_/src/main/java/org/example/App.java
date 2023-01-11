package org.example;

import org.example.onetoten.PredicateBasics;

import java.util.Scanner;

public class App
{
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
}
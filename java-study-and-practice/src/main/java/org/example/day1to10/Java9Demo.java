package org.example.day1to10;

/*
Starting in Java 9...
-We can have Private Methods in Interfaces
-Static factory methods for creating immutable collections
-Streams API update (takeWhile, dropWhile, ofNullable)
-"Try with resource" update
*/

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java9Demo implements Java9Interface {
    @Override // notice it's outside of main
    public void multiply(int a, int b) {
        System.out.print("Abstract method: " + a + " * " + b + " = ");
        System.out.println(a * b);
    }

    /////////////////////////////////

    public static void main(String[] args) {

        System.out.println("1.) Private Methods in Interface");
        Java9Demo demo = new Java9Demo();
        demo.multiply(3, 3);
        demo.accessingPrivate(6, 3);

        System.out.println("--------------------------------" +
                "\n2.) Quick Immutable Collections");
        List<String> list = List.of("abc", "xyz", "123");
        // list.add("hijk"); <-- uncomment to see exception
        for (String x:list) System.out.println(x);

        System.out.println("--------------------------------" +
                "\n3.) Stream API Update");
        List<Integer> nums = Arrays.asList(10, 40, 30, 7, 18, 23, 50, null, 100, null);
        System.out.print("The original numbers: ");
        for (Integer x:nums) System.out.print(x + " ");
        System.out.println("\ntakeWhile: " + nums.stream().takeWhile(x->x%5==0)
                .collect(Collectors.toList()));
        System.out.println("dropWhile: " + nums.stream().dropWhile(x->x%5==0)
                .collect(Collectors.toList()));
        System.out.println("ofNullable: " + nums.stream().flatMap(x-> Stream.ofNullable(x))
                .collect(Collectors.toList()));

        System.out.println("--------------------------------" +
                "\n4.) 'Try With Resource' Update");
        Java9Resource resource = new Java9Resource();

        try (resource) {
            resource.printHello();
        } catch (Exception e) {
            System.out.println("Ope! There's been an exception:\n" + e);
        }
    }
}

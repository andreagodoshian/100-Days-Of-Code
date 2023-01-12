package org.example.onetoten;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Java10Demo {
    public static void main(String[] args) {
        System.out.println("""
                Starting in Java 10, Oracle promised releases every six months.
                Updates may now contain fewer features, but they will be more
                frequent.
                ----------------------------------------------
                1.) var
                **NOTE: you can't use var with lambda""");

        var map = new HashMap<Integer, String>();
        map.put(1, "One");
        map.put(3, "Three");
        map.put(5, "Five");

        for (var x:map.entrySet()) {
            var value = x.getValue();
            System.out.println(value);
        }
        /*
        for (Map.Entry<String,String> entry : gfg.entrySet())
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
        */

        System.out.println("------------------------------" +
                "\n2.) Collectors API Update [Stream Unmodifiable]");
        List<Integer> list = List.of(15, 20, 25, 30, 35, 40);
        List<Integer> newModifiable = list.stream().filter(x -> x%3 == 0)
                .collect(Collectors.toList());
        List<Integer> newUnmodifiable = list.stream().filter(x -> x%3 == 0)
                .collect(Collectors.toUnmodifiableList());
        newModifiable.add(100);
        for (var x:newModifiable) System.out.print(x + " ");
        // newUnmodifiable.add(100); // <--uncomment for error
        System.out.println();
        for (var y:newUnmodifiable) System.out.print(y + " ");

    }
}

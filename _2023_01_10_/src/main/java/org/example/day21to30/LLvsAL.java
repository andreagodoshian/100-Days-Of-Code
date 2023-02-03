package org.example.day21to30;

import java.util.*;
// Source: https://www.youtube.com/watch?v=M_0q6rGUsNc&t=278s

public class LLvsAL {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("SUMMARY: DEPENDS ON THE SIZE OF THE LIST" +
                "\nAND/OR WHERE YOU'RE INSERTING!! WHEN IN DOUBT: TIME IT!" +
                "\n-----------------------------------------");

        for (int i=0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        final long startGetLL = System.nanoTime();
        linkedList.get(500000);
        final long endGetLL = System.nanoTime();

        final long startGetAL = System.nanoTime();
        arrayList.get(500000);
        final long endGetAL = System.nanoTime();

        System.out.println("linkedList.get(500000) took: " +
                (endGetLL - startGetLL));

        System.out.println("arrayList.get(500000) took: " +
                (endGetAL - startGetAL));

        final long startRemoveLL = System.nanoTime();
        linkedList.remove(500000);
        final long endRemoveLL = System.nanoTime();

        final long startRemoveAL = System.nanoTime();
        arrayList.remove(500000);
        final long endRemoveAL = System.nanoTime();

        System.out.println("linkedList.remove(500000) took: " +
                (endRemoveLL - startRemoveLL));

        System.out.println("arrayList.remove(500000) took: " +
                (endRemoveAL - startRemoveAL));

        final long startAddLL = System.nanoTime();
        linkedList.add(500000, 1);
        final long endAddLL = System.nanoTime();

        final long startAddAL = System.nanoTime();
        arrayList.add(500000, 1);
        final long endAddAL = System.nanoTime();

        System.out.println("linkedList.add(500000, 1) took: " +
                (endAddLL - startAddLL));

        System.out.println("arrayList.add(500000, 1) took: " +
                (endAddAL - startAddAL));

        final long startRemoveFirstLL = System.nanoTime();
        linkedList.remove(1);
        final long endRemoveFirstLL = System.nanoTime();

        final long startRemoveFirstAL = System.nanoTime();
        arrayList.remove(1);
        final long endRemoveFirstAL = System.nanoTime();

        System.out.println("linkedList.remove(1) took: " +
                (endRemoveFirstLL - startRemoveFirstLL));

        System.out.println("arrayList.remove(1) took: " +
                (endRemoveFirstAL - startRemoveFirstAL));
    }
}

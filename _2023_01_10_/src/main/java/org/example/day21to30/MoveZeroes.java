package org.example.day21to30;

import java.util.LinkedList;
import java.util.Queue;

public class MoveZeroes {

    public static void main(String[] args) {

        int[] myArr = new int[]{1, 2, 0, 3, 0, 4, 5, 0, 6};

        int[] shortArr = new int[]{5};
        solution(myArr);
        System.out.println();
        solution(shortArr);
    }

    public static void solution(int[] arr) {
        if (arr.length <= 1) {
            for (int x: arr) System.out.print(x + " ");
        }
        else {
            Queue<Integer> queue = new LinkedList<>();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) queue.add(arr[i]);
            }

            int index = 0;
            while (queue.size() != 0) {
                arr[index] = queue.poll();
                index++;
            }

            for (int i = index; i < arr.length; i++) {
                arr[i] = 0;
            }
            for (int x: arr) System.out.print(x + " ");
        }
    }
}

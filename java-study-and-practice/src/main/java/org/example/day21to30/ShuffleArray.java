package org.example.day21to30;
/*
Given the array nums consisting of 2n elements
in the form [x1,x2,...,xn,y1,y2,...,yn],
return the array in the form [x1,y1,x2,y2,...,xn,yn].
*/
public class ShuffleArray {

    public static void main(String[] args) {

        int[] arr1 = new int[]{2,5,1,3,4,7};
        int[] arr2 = new int[]{1,2,3,4,4,3,2,1};
        int[] arr3 = new int[]{1, 1, 1, 1, 1, 2, 2, 2, 2, 2};

        shuffle(arr1, 3);
        shuffle(arr2, 4);
        shuffle(arr3, 5);
    }

    public static void shuffle(int[] nums, int n) {
        int[] answer = new int[2*n];
        for (int i = 0; i < 2*n; i++) {
            if (i % 2 == 0) {
                answer[i] = nums[i / 2]; // bc "in half-time"
            } else {
                answer[i] = nums[n + (i / 2)]; // same but "n over"
            }
        }
        for (int x:answer) System.out.print(x + " ");
        System.out.println();
    }
}

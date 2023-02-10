package org.example.day21to30;

/*
There's a fixed-length flower-bed of zeroes and ones.
Flowers can't be next to each other &&
you have a specific number of flowers to plant...
determine if it's possible (true || false)
*/

import java.util.Arrays;

public class CanPlaceFlowers {

    public static void main(String[] args) {

        int[] bedWithOnes = new int[]{0, 1, 0, 0, 0, 1, 0};
        System.out.println("Bed A: " + Arrays.toString(bedWithOnes));
        System.out.println("One flower: " + solution(bedWithOnes, 1));
        System.out.println("Two flowers: " + solution(bedWithOnes, 2));

        int[] bedOfZeroes = new int[]{0, 0, 0, 0, 0};
        System.out.println("Bed B: " + Arrays.toString(bedOfZeroes));
        System.out.println("Three flowers: " + solution(bedOfZeroes, 3));
        System.out.println("Four flowers: " + solution(bedOfZeroes, 4));
    }

    public static boolean solution(int[] bed, int seeds){
        int totalCanPlant = 0;
        for (int i = 0; i < bed.length; i++) {
            if (bed[i] == 0) {
                boolean leftIsZero = (i - 1 < 0 || bed[i - 1] == 0);
                boolean rightIsZero = (i + 1 >= bed.length || bed[i + 1] == 0);
                if (leftIsZero && rightIsZero) {
                    totalCanPlant++;
                    bed[i] = 1;
                }
            }
        }
        return totalCanPlant >= seeds;
    }

}

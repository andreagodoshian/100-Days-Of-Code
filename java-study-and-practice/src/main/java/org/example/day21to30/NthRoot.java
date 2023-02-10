package org.example.day21to30;

/*
Not on LeetCode (lol thank goodness)
{ Num: 27, Root: 3 } == 3
{ Num: 7, Root: 3 } == 1.912
Error Allowed: 0.001
*/

public class NthRoot {

    public static void main(String[] args) {

        double errorAllowed = 0.001;
        System.out.println("Error allowed: " + errorAllowed);

        System.out.println("Square root of 4: " +
                solution(2, 4.0, errorAllowed));
        System.out.println("Square root of 16: " +
                solution(2, 16, errorAllowed));
        System.out.println("Cube root of 27: " +
                solution(3, 27, errorAllowed));

    }

    public static double solution(int root, double num, double errorAllowed) {
        if(num < 0) {
            System.err.println("Negative!");
            return -1;
        }
        if(num == 0) return 0;
        double x1 = num;
        double x2 = num / root;
        while (Math.abs(x1 - x2) > errorAllowed) {
            x1 = x2;
            x2 = ((root - 1.0) * x2 + num / Math.pow(x2, root - 1.0)) / root;
        }
        return x2;
    }

}
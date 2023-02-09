package org.example;

/*
NEED TO KNOW:
-Palindrome checker
-The Longest common prefix
-Roman to int
*/

public class App
{
    public static void main( String[] args ) {
        System.out.println("Hej Världen!");

        System.out.println(solution(1));
        System.out.println(solution(-1));
        System.out.println(solution(12321));
    }

    public static boolean solution(int x) {
        if (x < 0) return false;
        else if (x < 10) return true;
        else {
            int remainder = 0;
            int reversed = 0;
            int temp = x;

            while (temp > 0) {
                remainder = temp % 10;
                reversed = (reversed * 10) + remainder;
                temp /= 10;
            }
            return (x == reversed);
        }
    }
}
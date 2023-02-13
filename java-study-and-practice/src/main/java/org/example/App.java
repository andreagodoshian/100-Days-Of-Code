package org.example;

/*
NEED TO KNOW:
-Palindrome checker
-Common prefix
-Valid Parenthesis
-Remove Array Element
-Roman -> int
*/

public class App
{
    public static void main( String[] args ) {
        System.out.println("Hej Världen!");

        System.out.println(solution(2));
        System.out.println(solution(-2));
        System.out.println(solution(20));
        System.out.println(solution(202));
    }


    public static boolean solution(int x) {
        if (x<0) return false;
        if(x<10) return true;
        int remainder = 0;
        int answer = 0;
        int temp = x;
        while (temp > 0) {
            remainder = temp % 10;
            answer = (answer * 10) + remainder;
            temp /= 10;
        }
        return (answer == x);
    }
}
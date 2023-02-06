package org.example.day21to30;
/*
According to this Easy LeetCode, negatives don't count
*/
public class PalindromeChecker {

    public static void main(String[] args) {

        System.out.println(solution(2));
        System.out.println(solution(-2));
        System.out.println(solution(20));
        System.out.println(solution(202));
    }

    public static boolean solution(int x) {
        System.out.println(String.format("Is %d a palindrome?", x));
        if (x < 0) return false;
        else if (x < 10) return true;
        else {
            int temp = x; // don't modify original!
            int reversed = 0; // initialize so compiler is happy

            while (temp > 0) {
                int remainder = temp % 10;
                reversed = (reversed * 10) + remainder;
                temp /= 10;
            }
            if (x == reversed) return true;
            else return false;
        }
    }
}

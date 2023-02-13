package org.example;

/*
NEED TO KNOW:
-Palindrome checker
-Common prefix
-Valid Parenthesis
-Remove Array Element
-Roman -> int
*/

import java.util.HashMap;
import java.util.Stack;

public class App
{
    public static void main( String[] args ) {

        System.out.println("Hej! I shouldn't have eaten all those rice krispies :( not treats, just the cereal.");

        int[] arr = new int[]{2, 7, 11, 15};
        int[] ans = solution(arr, 9);

        for (int x: ans) {
            System.out.print(x + " ");
        }
    }

    public static int[] solution(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[2];
        int index = 0;

        for (int x:nums) {
            int diff = target - x;
            if (map.containsKey(diff)) {
                answer[0] = index;
                answer[1] = map.get(diff);
                break;
            }
            else {
                map.put(x, index);
                index++;
            }
        }
        return answer;
    }
}
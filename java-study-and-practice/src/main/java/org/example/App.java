package org.example;

import java.util.*;

/*
RECURRING THEME(S): try to go through each collection once.
As in, don't spend time converting a data structure BEFORE working with it (if that makes sense)

NEED TO KNOW:
-Two Sum
-Valid Parenthesis
-Palindrome checker
-Common prefix
-Roman -> int
-Plus One Array: 2-13 (go backwards - address best case, then the worst case)
-Remove Array Element
-Remove Array Duplicates (track the insert index [starts at 1])
-Search Insert
*/
public class App
{
    public static void main( String[] args ) {

        System.out.println("Hej! I shouldn't have eaten all those rice krispies :( not treats, just the cereal.");

        int[] arr = new int[]{2, 7, 11, 15};
        int[] ans1 = solution(arr, 9); // 0, 1
        for (int x: ans1) {
            System.out.print(x + " ");
        }
        int[] ans2 = solution(arr, 17); // 0, 3
        for (int x: ans2) {
            System.out.print(x + " ");
        }

    }

    public static int[] solution(int[] nums, int target) {

        // Think. What do I need to solve this? value and the index... so HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        // Look as the return: an array;
        int[] answer = new int[2];

        // remember - with these types of loops, you arguably have "index" built-in
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                answer[0] = i;
                answer[1] = map.get(diff);
            } else {
                map.put(nums[i], i);
            }
        }
        return answer;
    }

}
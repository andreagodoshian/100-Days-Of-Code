package org.example.day11to20;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        int[] arr = new int[]{2, 7, 11, 15};

        int[] ans = solution(arr, 9);

        for (int x: ans) {
            System.out.print(x + " ");
        }

    }

    public static int[] solution(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                ans[0] = i;
                ans[1] = map.get(diff);
                break;
            } else {
                map.put(nums[i], i);
            }
        }
        return ans;
    }

}

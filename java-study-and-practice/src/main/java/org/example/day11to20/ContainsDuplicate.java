package org.example.day11to20;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 7, 8};

        System.out.println(solution(arr));

    }

    public static boolean solution(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[1])) return true;
            else set.add(nums[i]);
        }

        return false;

    }

}

package org.example.day21to30;

public class Kadens {

    public static void main(String[] args) {

        int[] myArr = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println(maxSubArray(myArr));

    }

    public static int maxSubArray(int[] nums) {
        int curr = nums[0];
        int max = nums[0];

        for(int i = 1; i < nums.length; i++) {
            curr = Math.max(nums[i], nums[i] + curr);
            max = Math.max(max, curr);
        }

        return max;
    }

}

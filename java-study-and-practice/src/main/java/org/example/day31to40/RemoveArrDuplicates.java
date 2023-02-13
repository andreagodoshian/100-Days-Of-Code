package org.example.day31to40;

public class RemoveArrDuplicates {

    public static void main(String[] args) {

        int[] myArr1 = new int[]{0,0,1,1,1,2,2,3,3,4}; // 2 (returns 5)
        int[] myArr2 = new int[]{1, 2, 2, 3}; // 3 (returns 2)

        solution(myArr1);
        System.out.println();
        solution(myArr2);

    }

    public static int solution(int[] nums) {
        if (nums.length <= 1) return nums.length;

        int insertIndex = 1;
        // Passed "escape clause", so all starts at one
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]) {
                // remember: it's sorted already
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        for (int x:nums) System.out.print(x + " ");
        return insertIndex;
    }
}
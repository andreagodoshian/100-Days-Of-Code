package org.example.day31to40;

public class RemoveArrElement {

    public static void main(String[] args) {

        int[] myArr1 = new int[]{0,1,2,2,3,0,4,2}; // 2 (returns 5)
        int[] myArr2 = new int[]{3, 2, 2, 3}; // 3 (returns 2)

        System.out.println(solution(myArr1, 2));
        System.out.println(solution(myArr2, 3));
    }

    public static int solution(int[] nums, int val) {
        if (nums.length == 0) return 0;

        int indexForReturn = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[indexForReturn] = nums[i];
                indexForReturn++;
            }
        }
        return indexForReturn;
    }
}

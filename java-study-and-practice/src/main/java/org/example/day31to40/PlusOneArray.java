package org.example.day31to40;

public class PlusOneArray {
    public static void main(String[] args) {

        int[] myArr1 = new int[]{0, 1, 2, 2, 9};
        int[] myArr2 = new int[]{3, 2, 2, 3};
        int[] myArr3 = new int[]{9, 9, 9};

        solution(myArr1);
        System.out.println();
        solution(myArr2);
        System.out.println();
        solution(myArr3);
    }

    public static int[] solution(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < 9) {
                nums[i] += 1;
                for (int x:nums) System.out.print(x + " ");
                return nums;
            } else {
                nums[i] = 0;
            }
        }
        // assuming you haven't returned...
        // because 899 would be caught!!
        int[] worstCase = new int[nums.length + 1];
        worstCase[0] = 1;
        for (int x:worstCase) System.out.print(x + " ");
        return worstCase;
    }
}

package org.example.day31to40;

public class PlusOneArray {
    public static void main(String[] args) {

        int[] myArr1 = new int[]{0, 1, 2, 2, 9};
        int[] myArr2 = new int[]{3, 2, 2, 3};

        solution(myArr1);
        System.out.println();
        solution(myArr2);
    }

    // the kicker is that you're going backwards
    // and "auto-escape" if last digit is < 9
    public static int[] solution(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < 9) {
                ++nums[i];
                for (int x:nums) System.out.print(x + " ");
                return nums;
            }
            nums[i] = 0;
        }

        int[] ans = new int[nums.length + 1];
        ans[0] = 1;
        for (int x:nums) System.out.print(x + " ");
        return ans;
    }
}

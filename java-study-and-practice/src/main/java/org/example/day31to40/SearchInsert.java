package org.example.day31to40;

public class SearchInsert {

    public static void main(String[] args) {
        int[] myArr = new int[]{1, 3, 5, 6};
        System.out.println("Using array:");
        for (int x:myArr) System.out.print(x + " ");
        System.out.println();

        System.out.println(solution(myArr, 5)); // answer: 2
        System.out.println(solution(myArr, 2)); // answer: 1
        System.out.println(solution(myArr, 7)); // answer: 4
    }

    // search the list, and find out where to insert the target
    public static int solution(int[] nums, int target) {
        System.out.println("Target: " + target);
        int answer = 0;
        if (nums.length == 0) return 0;
        else if (nums.length == 1) {
            if (target <= nums[0]) {
                return 0;
            } else return 1;
        } else {
            for (int i = 0; i < nums.length - 1; i++) {
                if (target == nums[i]) {
                    answer = i;
                    break;
                } else if (target > nums[i] && target <= nums[i + 1]) {
                    answer = i + 1;
                    break;
                } else if (target > nums[i + 1] && (nums.length - 1 == i + 1)) {
                    answer = nums.length;
                    break;
                }
            }
            return answer;
        }
    }
}
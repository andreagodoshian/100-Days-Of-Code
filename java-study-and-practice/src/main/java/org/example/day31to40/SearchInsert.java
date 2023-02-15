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
        if (nums.length == 0) return answer;
        else {
            for (int i = 0; i < nums.length; i++) {
                if (target > nums[i] && target <= nums[i+1]) {
                    answer = i + 1;
                    break;
                }
                // need to catch BEFORE error (i.e. nums[i+1])
                // general "else" won't work here
                else if (target > nums[i+1] && nums.length-1 == i+1) {
                    answer = nums.length;
                    break;
                }
            }
        }
        return answer;
    }
}
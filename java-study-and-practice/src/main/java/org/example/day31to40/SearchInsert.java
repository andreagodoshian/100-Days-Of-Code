package org.example.day31to40;

public class SearchInsert {

    public static void main(String[] args) {

    }

    public static int searchInsert(int[] nums, int target) {

        if (nums.length==0) return 0;

        if (nums.length==1) {
            if (target>nums[0]){
                return 1;
            } else return 0;
        }

        int answer = 0;

        for(int i=0;i<nums.length-1;i++){
            if (target == nums[i]){
                answer =  i;
                break;
            } else if (target>nums[i] && target<=nums[i+1]){
                answer = i+1;
                break;
            } else if (target>nums[i+1] && (nums.length-1==i+1)){
                answer= nums.length;
                break;
            }
        }
        return answer;
    }
}
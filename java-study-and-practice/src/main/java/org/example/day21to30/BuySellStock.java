package org.example.day21to30;

public class BuySellStock {

    public static void main(String[] args) {
        int[] myArr = new int[]{7, 1, 5, 3, 6, 4};

        System.out.println(solution(myArr));
    }

    public static int solution(int[] prices) {

        if (prices.length <= 1) return 0; // escape

        int profit = 0;
        int leftIndex = 0;

        for (int rightIndex = 1; rightIndex < prices.length; rightIndex++) {
            if (prices[rightIndex] > prices[leftIndex]) {
                profit = Math.max(profit, (prices[rightIndex] - prices[leftIndex]));
            } else {
                leftIndex = rightIndex;
            }
        }
        return profit;
    }
}

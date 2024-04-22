package org.example.arrays;

public class BestTimeBuySellStock_122 {

    public static void main(String[] args) {

        final int[] prices = {7, 1, 5, 3, 6, 4};
        final int[] prices2 = {1, 2, 3, 4, 5};

        BestTimeBuySellStock_122 bestTimeBuySellStock_122 = new BestTimeBuySellStock_122();

        System.out.println(bestTimeBuySellStock_122.maxProfit(prices));

        System.out.println(bestTimeBuySellStock_122.maxProfit(prices2));


    }

    public int maxProfit(int[] prices) {

        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) { // sell > bought
                // sell
                profit += prices[i] - prices[i - 1]; // profit = sell - bought
            }
        }

        return profit;
    }

}

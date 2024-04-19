package org.example.arrays;

import java.util.Arrays;

public class BestTimeBuySellStock_121 {

    public int maxProfit(int[] prices) {

        int minPrice = Arrays.stream(prices).max().getAsInt();
        int  maxProfit = 0;

        for(int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
            if(price - minPrice > maxProfit ) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;

    }



    public static void main(String[] args) {

        final int[] prices = {7,1,5,3,6,4};
        final int[] prices2 = {7,6,4,3,1};

        BestTimeBuySellStock_121 bestTimeBuySellStock_121 = new BestTimeBuySellStock_121();

        System.out.println(bestTimeBuySellStock_121.maxProfit(prices));

        System.out.println(bestTimeBuySellStock_121.maxProfit(prices2));

    }


}

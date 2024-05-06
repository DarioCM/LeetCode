package org.example.arrays;

import java.util.Arrays;

public class Candy_135 {


    public static int candy(int[] ratings) {

        int n = ratings.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] result = new int[n];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            left[i] = 1;
            right[i] = 1;
        }

        //left
        for (int i = 1; i < n; ++i) {
            if (ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            }
        }

        //right
        for (int i = n - 2; i >= 0; --i) {
            if (ratings[i] > ratings[i + 1]) {
                right[i] = right[i + 1] + 1;
            }
        }

        for (int i = 0; i < n; i++){
            result[i] = Math.max(left[i], right[i]);
            ans += Math.max(left[i], right[i]);
        }

        System.out.println(Arrays.toString(result));

        return ans;
    }

    public static void main(String[] args) {
        int[] ratings = {1, 0, 2};
        candy(ratings);
        int[] ratings2 = {1, 2, 2};
        candy(ratings2);
    }


}

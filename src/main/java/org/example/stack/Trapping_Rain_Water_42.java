package org.example.stack;

import java.util.*;

public class Trapping_Rain_Water_42 {

    public static int trap(int[] height) {

        int n = height.length;
        if (n == 0) {
            return 0;
        }

        int[] left = new int[n];
        int[] right = new int[n];
        int storedWater = 0;

        //GREEDY

        // Left array
        left[0] = height[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }
        System.out.println(Arrays.toString(left));

        // right array
        right[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }
        System.out.println(Arrays.toString(right));

        // Calculate trapped water
        for (int i = 0; i < n; i++) {
            int minHeight = Math.min(left[i], right[i]);
            storedWater += minHeight - height[i];
        }

        return storedWater;
    }


    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(">>>>>" + trap(height));
        int[] height2 = {4, 2, 0, 3, 2, 5};
        System.out.println(trap(height2));
    }
}

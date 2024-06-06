package org.example.twoPointers;

public class ContainerMostWater_11 {

    public static int maxArea(int[] height) {

        int l = 0;
        int r = height.length - 1;

        int max = 0;

        while (l < r) {
            int min = Math.min(height[l], height[r]);
            int area = min * (r-l);

            if (area > max){
                max = area;
            }

            if(height[l] <= height[r]) {
                l++;
            } else {
                r--;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int maxArea = maxArea(height);
        System.out.println(">>> " + maxArea);

    }

}

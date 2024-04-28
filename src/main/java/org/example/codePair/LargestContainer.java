package org.example.codePair;

/*
 * This is most sought after problem and here it goes, there is an array of heights is provided to you, and you need to
 *  find the largest container that can hold the water off course the most water.
 * */
public class LargestContainer {

    // int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

    public static int maxArea(int[] height) {

        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int width = right - left;
            int h = Math.min(height[left], height[right]);
            int area = width * h;
            maxArea = Math.max(maxArea, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("maxArea " + maxArea);

        return maxArea;
    }

    public static void main(String[] args) {
        LargestContainer largestContainer = new LargestContainer();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        maxArea(height);
    }


}

package org.example.arrays;

import java.util.Arrays;

public class RotateArray_189 {

    public  void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        //System.out.println(Arrays.toString(nums));
        reverse(nums, 0, k - 1);
        //System.out.println(Arrays.toString(nums));
        reverse(nums, k, nums.length - 1);
        //System.out.println(Arrays.toString(nums));
    }

    public  void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }




}

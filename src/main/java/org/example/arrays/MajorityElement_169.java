package org.example.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

/*
* Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.


*
* */
public class MajorityElement_169 {

    public static int majorityElement(int[] nums) {

        var n = nums.length;
        var half = n / 2;
        var counter = new HashMap<Integer, Integer>();

        for (int num : nums) {
            int currentCount = counter.getOrDefault(num, 0) + 1;
            if (currentCount > half) {
                return num;
            }
            counter.put(num, currentCount);
        }
        return 0;
    }

    public static void main(String[] args) {

        //[3,2,3]
        //[2,2,1,1,1,2,2]
        final int[] nums = {3, 2, 3};
        final int[] nums2 = {2, 2, 1, 1, 1, 2, 2};

        System.out.println(MajorityElement_169.majorityElement(nums));

        System.out.println(MajorityElement_169.majorityElement(nums2));

    }


}

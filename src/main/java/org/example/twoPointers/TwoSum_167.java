package org.example.twoPointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_167 {

    public static int[] twoSum(int[] numbers, int target) {


        int[] result = new int[2];
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int current = numbers[left] + numbers[right];
            int middle = left + (right - left) / 2;
            if (current == target) {
                result[0] = left + 1;
                result[1] = right + 1;
                break;
            } else if (current < target) {
                left = (numbers[middle] + numbers[right] < target) ? ++middle : ++left;
            } else {
                right = (numbers[middle] + numbers[left] > target) ? --middle : --right;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int[] result = twoSum(numbers, 9);
        System.out.println(Arrays.toString(result));
    }




}

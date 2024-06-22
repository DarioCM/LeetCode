package org.example.slidingWindow;

public class MinSizeSubarraySum {

    public static void main(String[] args) {
        MinSizeSubarraySum minSizeSubarraySum = new MinSizeSubarraySum();
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(minSizeSubarraySum.minSubArrayLen(target, nums));
    }

    public int minSubArrayLen(int target, int[] nums) {

        int minLen = Integer.MAX_VALUE;
        int sum = 0;

        int left = 0;
        int right = 0;

        while (right < nums.length) {
            sum += nums[right];
            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
            ++right;
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;

    }

}

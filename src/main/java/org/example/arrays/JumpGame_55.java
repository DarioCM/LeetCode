package org.example.arrays;

public class JumpGame_55 {

    public static void main(String[] args) {

        final int[] nums = {2, 3, 1, 1, 4};
        final int[] nums2 = {3, 2, 1, 0, 4};

        JumpGame_55 jumpGame_55 = new JumpGame_55();

        System.out.println(jumpGame_55.canJump(nums));

        System.out.println(jumpGame_55.canJump(nums2));


    }

    public boolean canJump(int[] nums) {

        int goal = nums.length - 1; //because we start in 0

        for (int index = nums.length - 1; index >= 0; index--) {
            if (nums[index] + index >= goal) { //jumps + position >= goal
                goal = index; // so we jump
            }
        }

        return goal == 0;
    }
}

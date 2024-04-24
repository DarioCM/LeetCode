package org.example.arrays;

public class JumpGameII_45 {

    public static void main(String[] args) {

        final int[] nums = {2, 3, 1, 1, 4};
        final int[] nums2 = {2, 3, 0, 1, 4};

        JumpGameII_45 jumpGameII_45 = new JumpGameII_45();

        System.out.println(jumpGameII_45.jump(nums));

        System.out.println(jumpGameII_45.jump(nums2));


    }

    public int jump(int[] nums) {

        int farthestJumpIndex = 0;
        int currentEndIndex = 0;
        int jumps = 0;

        int indexPosition = 0;

        for (int currentJumps : nums) {

            farthestJumpIndex = farthestJumpIndex > indexPosition + currentJumps ? farthestJumpIndex : indexPosition + currentJumps;

            if (indexPosition == currentEndIndex) {
                jumps++;
                currentEndIndex = farthestJumpIndex;
            }

            if(currentEndIndex >= nums.length-1) return jumps;

            indexPosition++;
        }

        return -1;

    }

}

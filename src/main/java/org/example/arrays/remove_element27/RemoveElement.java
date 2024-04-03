package org.example.arrays.remove_element27;



import java.util.Arrays;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {

        int count = 0;
        for (int num: nums){
            if(num != val){
                nums[count] = num;
                count++;
            }
        }

        //System.out.println(Arrays.toString(nums));

        return count;
    }

    public static void main(String[] args) {

        int nums[] = {0,1,2,2,3,0,4,2};
        int val = 2;


        System.out.println(RemoveElement.removeElement(nums, val));



    }

}

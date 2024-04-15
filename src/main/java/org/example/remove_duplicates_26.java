package org.example;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

//26. Remove Duplicates from Sorted Array
public class remove_duplicates_26 {

    public static int removeDuplicates(int[] nums) {

        Set<Integer> set = new LinkedHashSet<Integer>();

        int i = 0;
        for (int num : nums) {
            if(set.add(num)){
                nums[i] = num;
                i++;
            }
        }

        //System.out.println(Arrays.toString(nums));

        return set.size();
    }

    public static void main(String[] args) {

        int nums[] = {0,0,1,1,1,2,2,3,3,4};


        System.out.println(remove_duplicates_26.removeDuplicates(nums));



    }
}

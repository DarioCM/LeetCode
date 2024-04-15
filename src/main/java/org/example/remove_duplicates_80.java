package org.example;

import java.util.*;

public class remove_duplicates_80 {

    public static int removeDuplicates(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        //Arrays.sort(nums);
        int index = 0;
        for (int num : nums) {
            int frequency = map.getOrDefault(num,0);
            map.put(num, frequency + 1);
            if(map.get(num) <= 2 ) {
                nums[index] = num;
                ++index;
            }
        }
        return index;
    }

    public static void main(String[] args) {

        int nums[] = {0,0,1,1,1,1,2,3,3};


        System.out.println(remove_duplicates_80.removeDuplicates(nums));



    }


}



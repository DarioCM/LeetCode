package org.example.slidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LonSubstringNoRepeting {

    public static void main(String[] args) {
        LonSubstringNoRepeting lonSubstringNoRepeting = new LonSubstringNoRepeting();
        System.out.println(lonSubstringNoRepeting.lengthOfLongestSubstring("pwwkew"));
    }

    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int right = 0;
        int max = 0;

        HashMap<Character,Integer> hashMap = new HashMap<>();

        for(; right < s.length(); right++) {
            char c = s.charAt(right);
            if ( hashMap.containsKey(c) && hashMap.get(c) >= left) {
                left = hashMap.get(c) + 1;
            }
            max = Math.max(max, right - left + 1);
            hashMap.put(c, right);
        }

        return max;
    }


}

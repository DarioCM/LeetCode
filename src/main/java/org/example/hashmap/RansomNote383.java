package org.example.hashmap;

import java.util.HashMap;
import java.util.Map;

public class RansomNote383 {

    public static void main(String[] args) {
        RansomNote383 ransomNote383 = new RansomNote383();

        String ransomNote = "a", magazine = "b";
        String ransomNote2 = "aa", magazine2 = "ab";
        String ransomNote3 = "aa", magazine3 = "aab";

        System.out.println(ransomNote383.canConstruct(ransomNote, magazine));
        System.out.println(ransomNote383.canConstruct(ransomNote2, magazine2));
        System.out.println(ransomNote383.canConstruct(ransomNote3, magazine3));

    }

    public boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> map = new HashMap();

        for (var c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (var c : ransomNote.toCharArray()) {
            int count = map.getOrDefault(c,0);
            map.put(c,count-1);
            if (map.get(c) < 0) return false;
        }


        return true;
    }


}

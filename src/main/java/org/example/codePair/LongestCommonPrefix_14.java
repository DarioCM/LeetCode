package org.example.codePair;

import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix_14 {

    public String longestCommonPrefix(String[] strs) {

        String shortest = Arrays.asList(strs).stream().min(Comparator.comparing(String::length)).get();

        for (String s : strs){
           while (!shortest.isEmpty()){
               if(s.startsWith(shortest)){
                   break;
               } else {
                   shortest = shortest.substring(0,shortest.length()-1);
               }
           }
        }

        return shortest;
    }

    public static void main(String[] args) {

        String[]  strs = {"flower","flow","flight"};
        String[]  strs2 = {"dog","racecar","car"};

        LongestCommonPrefix_14 longestCommonPrefix_14 = new LongestCommonPrefix_14();

        System.out.println(longestCommonPrefix_14.longestCommonPrefix(strs));

        System.out.println(longestCommonPrefix_14.longestCommonPrefix(strs2));

    }

}

package org.example.string;

public class FindTheIndex_28 {

    public static int strStr(String haystack, String needle) {

        // time complexity O(nm) and space complexity O(1).
       return haystack.indexOf(needle);
    }

    public static void main(String[] args){
        strStr("sadbutsad","sad");
    }

}

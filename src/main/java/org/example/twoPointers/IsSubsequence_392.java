package org.example.twoPointers;

public class IsSubsequence_392 {

    public static boolean isSubsequence(String s, String t) {

        int sIndex = 0;
        for(int tIndex = 0; tIndex < t.length() && sIndex < s.length(); tIndex++){
            if (s.charAt(sIndex) == t.charAt(tIndex) ){
                ++sIndex;
            }
        }

        return sIndex == s.length();
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("b", "abc"));
    }


}

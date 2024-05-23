package org.example.string;

import java.util.Stack;

public class ReverseWord_151 {

    public static String reverseWords(String s) {

        StringBuilder result = new StringBuilder();

        String[] arrayS = s.trim().split("\\s+");

        for (int i = arrayS.length - 1; i >= 1; i--) {
            result.append(arrayS[i]);
            result.append(" ");
        }
        result.append(arrayS[0]);

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "  hello world  ";
        System.out.println(reverseWords(s));
    }


}

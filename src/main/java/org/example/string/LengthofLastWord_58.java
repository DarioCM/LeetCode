package org.example.string;

public class LengthofLastWord_58 {

    public static int lengthOfLastWord(String s) {

        String[] arr = s.trim().split("\\s");

        return arr[arr.length-1].length();

    }

    public static void main(String[] args) {
        String str = "   fly me   to   the moon  ";
        System.out.println(">>> " + lengthOfLastWord(str));
    }

}

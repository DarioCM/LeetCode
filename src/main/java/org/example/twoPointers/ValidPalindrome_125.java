package org.example.twoPointers;

import java.util.LinkedList;

public class ValidPalindrome_125 {

    public static boolean isPalindrome(String s) {

        /*
        LinkedList<Character> stack = new LinkedList<>();
        LinkedList<Character> queue = new LinkedList<>();

        for (var c : s.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z' || c >= '0' && c <= '9' ) {
                queue.addLast(c);
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.removeFirst())) {
                return false;
            }
        }

        return true;

         */

        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for (var c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z' || c >= '0' && c <= '9' ) {
                sb.append(c);
            }
        }

        s = sb.toString();
        int i = 0;
        int n = s.length()-1;

        while(i < n){
            if (s.charAt(i++) != s.charAt(n--)){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

}

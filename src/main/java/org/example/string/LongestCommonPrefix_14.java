package org.example.string;

public class LongestCommonPrefix_14 {

    public static String longestCommonPrefix(String[] strs) {

        /*
        String shortest = Arrays.asList(strs).stream().min(Comparator.comparing(String::length)).get();

        for (String s : strs) {
            while (!shortest.isEmpty()) {
                if (s.startsWith(shortest)) {
                    break;
                } else {
                    shortest = shortest.substring(0, shortest.length() - 1);
                }
            }
        }*/

        String shortest = strs[0];
        for (var s : strs) {
            if (s.length() < shortest.length()) {
                shortest = s;
            }
        }

        for (var s : strs) {
            while (!shortest.isEmpty()) {
                if (s.startsWith(shortest)) {
                    break;
                } else {
                    shortest = shortest.substring(0, shortest.length() - 1);
                }
            }
        }



        return shortest;

    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(">>> " + longestCommonPrefix(strs));
    }


}

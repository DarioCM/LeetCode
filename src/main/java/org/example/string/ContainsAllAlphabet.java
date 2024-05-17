package org.example.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Check if a String Contains All the Letters of the Alphabet
public class ContainsAllAlphabet {

    public static boolean checkStringForAllLetterUsingStream(String input) {
        long c = input.toLowerCase().chars().filter(ch -> ch >= 'a' && ch <= 'z').distinct().count();
        return c == 26;
    }

    public static boolean checkStringForAllTheLetters(String input) {
        //Map<Character, Integer> map = new HashMap<>();

        if (input.isBlank() || input.isEmpty()){
            return false;
        }

        Set<Character> listSet = new HashSet<>();
        input =  input.toLowerCase();
        for (char charV : input.toCharArray()) {
            if ('a' <= charV && charV <= 'z') {
               listSet.add(charV);
            }
        }
        return listSet.size() == 26;
    }

    public static void main(String[] args) {
        String sentence = "Farmer jack realzed that big yellow quilts were expensive";
        System.out.println(checkStringForAllTheLetters(sentence));
    }


}

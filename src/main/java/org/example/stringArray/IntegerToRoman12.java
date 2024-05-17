package org.example.stringArray;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class IntegerToRoman12 {

    static final int[] arabics = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    static final String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I",};

    public static String intToRoman(int num) {

        StringBuilder result = new StringBuilder();
        var index = 0;

        for(var arabic : arabics){
            var letter = symbols[index++];
            while(arabic <= num){
                num -= arabic;
                result.append(letter);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(58));
    }

}

package org.example.stringArray;

public class IntegerToRoman12 {

    static final int[] arabics = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    static final String[] romanLetters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};


    public static String intToRoman(int num) {

        StringBuilder result = new StringBuilder();
        int i = 0;

        for (var arabic: arabics) {
            while (arabic <= num) {
                result.append(romanLetters[i]);
                num -= arabic;
            }
            i++;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(58));
    }

}

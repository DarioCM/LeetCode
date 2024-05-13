package org.example.stringArray;

public class RomanToInt_13 {

    public static int romanToInt(String s) {

        int total = 0, previous = 0;
        //Read from Right to Left
        for (int i = s.length() - 1; i >= 0; i--) {

            var current = switch (s.charAt(i)) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> 0;
            };

            if (previous > current) { // 4 = IV, 9 = IX for example
                total -= current;
            } else {
                total += current; // 6 = VI, 11 = XI for example
                previous = current;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        String s = "III";
        System.out.println(romanToInt(s));

        String s2 = "LVIII";
        System.out.println(romanToInt(s2));

        String s3 = "MCMXCIV";
        System.out.println(romanToInt(s3));
    }


}

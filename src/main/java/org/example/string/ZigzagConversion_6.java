package org.example.string;

import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion_6 {

    public static String convert(String s, int numRows) {

        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

       StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int indexRow = 0;
        boolean goUp = false;

        for (var c : s.toCharArray()) {
            if (indexRow == 0 || indexRow == numRows - 1) {
                goUp = !goUp;
            }
            rows[indexRow].append(c);
            indexRow += goUp ? 1 : -1;
        }

        StringBuilder solution = new StringBuilder();
        for (var row : rows) {
            solution.append(row);
        }


        return solution.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }

}

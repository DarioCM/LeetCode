package org.example;

import java.util.Arrays;

public class Citi {

    public int solution(int[] A) {
        Arrays.sort(A);
        int min = 1; //grather than 0
        for (var n : A) {
            if (n == min) {
                min++;
            }
        }
        return min;
    }


    public static void main(String[] args) {
        Citi citi = new Citi();
        int[] A = {1, 3, 6, 4, 1, 2};
        System.out.println(citi.solution(A));
    }
}

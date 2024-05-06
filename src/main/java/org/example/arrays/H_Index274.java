package org.example.arrays;

import java.util.Arrays;

public class H_Index274 {

    public static void main(String[] args) {

        int[] citations = {3, 0, 6, 1, 5};
        int[] citations2 = {1, 3, 1};

        H_Index274 h_index274 = new H_Index274();
        h_index274.hIndex(citations);
        h_index274.hIndex(citations2);

    }

    public int hIndex(int[] citations) {

        // sorted the array
        Arrays.sort(citations);
        //System.out.println(Arrays.toString(citations));

        int h = 0;
        int i = 0;
        for (var count : citations) {
            h = Math.max(h, Math.min(citations.length - i, count));
            i++;
        }

        //System.out.println(" >>>>>>> " + h);

        return h;
    }

}

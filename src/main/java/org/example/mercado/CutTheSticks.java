package org.example.mercado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CutTheSticks {


    public static void main(String[] args) {

        int[] arr = {5, 4, 4, 2, 2, 8};
        List<Integer> result = new ArrayList<>();


        for (int j = 0; j < arr.length; j++) {
            var min = getMin(arr);
            int ceroCount = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    arr[i] = arr[i] - min;
                } else if (arr[i] == 0) {
                    ++ceroCount;
                }
            }

            if (ceroCount == arr.length) {
                break;
            }

            result.add(arr.length - ceroCount);

        }

        System.out.println(">>> " + Arrays.toString(result.toArray()));

    }

    public static int getMin(int[] arr) {
        int res = getMax(arr);
        for (var n : arr) {
            if (n > 0) {
                res = Math.min(res, n);
            }
        }
        return res;
    }

    public static int getMax(int[] arr) {
        int res = arr[0];
        for (var n : arr) {
            res = Math.max(res, n);
        }
        return res;
    }

}

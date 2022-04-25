package com.careerdevs.Edabit;

import java.util.Arrays;

public class DifferenceOfMaxAndMin {

    public static void main(String[] args) {
        differenceMaxMin(new int[]{10, 4, 1, 2, 8, 91});
    }


    public static int differenceMaxMin(int[] arr) {
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length - 1];
        return max - min;
    }
}

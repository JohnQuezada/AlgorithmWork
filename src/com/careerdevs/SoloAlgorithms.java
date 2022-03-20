package com.careerdevs;

import java.util.Arrays;

public class SoloAlgorithms {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(numberSplit(4)));
    }

    public static int[] numberSplit(int n) {
        return new int[] {(int)Math.floor(n/2.0), (int)Math.ceil(n/2.0)};
    }
}

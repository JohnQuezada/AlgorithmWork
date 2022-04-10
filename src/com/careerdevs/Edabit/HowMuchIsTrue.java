package com.careerdevs.Edabit;

public class HowMuchIsTrue {
    public static void main(String[] args) {
        countTrue(new boolean[] { true, false, false, true, false });
    }

    public static int countTrue(boolean[] arr) {
        int numberOfTrues = 0;
        for (boolean trues : arr) {
            if (trues) {
                numberOfTrues += 1;
            }
        }
        return numberOfTrues;
    }
}

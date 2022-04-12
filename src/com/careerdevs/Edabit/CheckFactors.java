package com.careerdevs.Edabit;

public class CheckFactors {

    public static void main(String[] args) {

        checkFactors(new int[]{2, 3, 4}, 12);

    }

    public static boolean checkFactors(int[] factors, int num) {
        for (int i = 0 ; i < factors.length ; i++) {
            if (num % factors[i] != 0) {
                return false;
            }
        }
        return true;
    }
}

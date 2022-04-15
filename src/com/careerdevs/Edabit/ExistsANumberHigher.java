package com.careerdevs.Edabit;

public class ExistsANumberHigher {

    public static void main(String[] args) {
        System.out.println(existsHigher(new int[] {5, 3, 15, 22, 4}, 10));
    }

    public static boolean existsHigher(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= n) {
                return true;
            }
        }
        return false;
    }
}

package com.careerdevs.Edabit;

public class GetTheSumOfAllArrayElements {
    public static void main(String[] args) {
        arraySum(new int[]{2, 7, 4});
    }
    public static int arraySum(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }
}

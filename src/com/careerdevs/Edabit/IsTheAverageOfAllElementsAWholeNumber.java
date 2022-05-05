package com.careerdevs.Edabit;

public class IsTheAverageOfAllElementsAWholeNumber {
    public static void main(String[] args) {
        System.out.println(isAvgWhole(new int[]{3, 5, 9}));
    }

    public static boolean isAvgWhole(int[] arr) {
        int arrayValue = 0;
        for (int i = 0; i < arr.length; i++) {
            arrayValue += arr[i];
        }
        if ((arrayValue % arr.length) != 0) {
            return false;
        }
        return true;
    }
}
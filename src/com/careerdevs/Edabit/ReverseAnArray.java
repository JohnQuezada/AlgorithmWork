package com.careerdevs.Edabit;

public class ReverseAnArray {
    public static void main(String[] args) {
        reverse(new int[]{5, -7, 8, 3});
    }
    public static int[] reverse(int[] arr) {
        int[] reverse = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reverse[i] = arr[arr.length - 1 - i];
        }
        return reverse;
    }
}

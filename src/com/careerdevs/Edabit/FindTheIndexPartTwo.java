package com.careerdevs.Edabit;

public class FindTheIndexPartTwo {
    public static void main(String[] args) {
        search(new int[]{1, 2, 3, 4}, 3);
    }

    public static int search(int arr[], int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;
    }
}

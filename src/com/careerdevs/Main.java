package com.careerdevs;

public class Main {


    public static void main(String[] args) {

        System.out.println(getFirstValue(new int[]{1, 2, 3, 4}));

        System.out.println(addition(2));
    }

    public static int getFirstValue(int[] arr) {
        return arr[0];
    }

    public static int addition(int num) {
        return num + 1;
    }
}

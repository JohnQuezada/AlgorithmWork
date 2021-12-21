package com.careerdevs;

public class Main {


    public static void main(String[] args) {

        System.out.println(getFirstValue(new int[]{1, 2, 3, 4}));

        System.out.println(addition(2));

        System.out.println(search(new int[]{1, 2, 3, 4},3));

        System.out.println(convert(6));

        System.out.println(giveMeSomething("a"));
    }

    public static int getFirstValue(int[] arr) {
        return arr[0];
    }

    public static int addition(int num) {
        return num + 1;
    }

    public static int search(int[] arr, int item) {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]==item)
                return i;
        }
        return -1;
    }

    public static int convert(int minutes) {
        return minutes * 60;
    }

    public static String giveMeSomething(String a) {
        return "something " + a;
    }
}

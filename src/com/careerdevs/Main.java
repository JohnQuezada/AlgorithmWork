package com.careerdevs;

public class Main {


    public static void main(String[] args) {
        // 1
        System.out.println(getFirstValue(new int[]{1, 2, 3, 4}));
        // 2
        System.out.println(addition(2));
        // 3
        System.out.println(search(new int[]{1, 2, 3, 4},3));
        // 4
        System.out.println(convert(6));
        // 5
        System.out.println(giveMeSomething("a"));
        // 6
        System.out.println(reverse(false));
        // 7
        System.out.println(countWords("It's high noon"));
        // 8
        System.out.println(existsHigher(new int[] {5, 3, 15, 22, 4}, 10));
        // 9
        System.out.println(getCount("Celebration"));
        // 10
        System.out.println(sum(3, 2));
        // 11
        System.out.println(isSameNum(2,2));
        // 12
        System.out.println(calcAge(10));
        // 13
        System.out.println(helloName("Gerald"));
        // 14
        System.out.println(reverse(".tnereffid knihT"));
    }
    // 1st question
    public static int getFirstValue(int[] arr) {
        return arr[0];
    }

    // 2nd question
    public static int addition(int num) {
        return num + 1;
    }

    // 3rd question
    public static int search(int[] arr, int item) {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]==item)
                return i;
        }
        return -1;
    }

    // 4th question
    public static int convert(int minutes) {

        return minutes * 60;
    }

    // 5th question
    public static String giveMeSomething(String a) {

        return "something " + a;
    }

    // 6th question
    public static boolean reverse(boolean b) {

        return !b;
    }

    // 7th question
    public static int countWords(String s) {

        return s.split(" ").length;
    }

    // 8th question
    public static boolean existsHigher(int[] arr, int n) {
            for (int i : arr) {
                if (i >= n) return true;
            }
            return false;
        }

    // 9th question
    public static int getCount(String str) {
        int vowelsCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if ("aeiouAEIOU".contains(String.valueOf(str.charAt(i)))) {
                vowelsCount++;
            }
        }

        return vowelsCount;
    }

    // 10th question
    public static int sum(int a, int b) {
        return a + b;
    }

    // 11th question
    public static boolean isSameNum(int x, int y) {
        if (x == y) {
            return true;
        } else {
            return false;
        }
    }

    // 12th question
    public static int calcAge(int age) {
        return age * 365;
    }

     // 13th question
     public static String helloName(String name) {
         return "Hello " + name + "!";
     }

     // 14th question
     public static String reverse(final String str) {
         return new StringBuilder(str).reverse().toString();
     }

}

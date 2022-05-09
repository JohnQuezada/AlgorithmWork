package com.careerdevs.Edabit;

public class RepeatingLettersNTimes {
    public static void main(String[] args) {
        repeat("mice", 5);
    }
    public static String repeat(String str, int n) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < n; j++) {
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }
}

//Python Solution
//    def repeat(txt, n):
//        newtxt = ""
//        for char in txt:
//        newtxt += n * char
//        return newtxt
package com.careerdevs.Edabit;

public class CountInstancesOfACharacterInAString {
    public static void main(String[] args) {
        charCount('a', "edabit");
    }
    public static int charCount(char c, String str) {
        int numberOfChars = 0;
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) numberOfChars++;
        }
        return numberOfChars;
    }
}

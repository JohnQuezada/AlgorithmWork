package com.careerdevs.Edabit;

public class DoubleLetters {
    public static void main(String[] args) {
        doubleLetters("Rude");
    }
    public static boolean doubleLetters(String word) {
        for (int i = 0; i< word.length() -1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) return true;
        }
        return false;
    }
}

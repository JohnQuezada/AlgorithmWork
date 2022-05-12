package com.careerdevs.Edabit;

public class ReturnTheIndexOfTheFirstVowel {
    public static void main(String[] args) {
        firstVowel("apple");
    }

    public static int firstVowel(String str) {
        str = str.replaceAll("[aAoOeEuUiI]", " ");
        return str.indexOf(" ");
    }
}

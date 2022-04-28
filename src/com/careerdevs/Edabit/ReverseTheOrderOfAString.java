package com.careerdevs.Edabit;

public class ReverseTheOrderOfAString {
    public static void main(String[] args) {
        reverse("Hello world!");
    }
    public static String reverse(final String str) {
        return new StringBuilder(str).reverse().toString();
    }
}

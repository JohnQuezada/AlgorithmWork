package com.careerdevs.Edabit;

public class IsTheStringAPalindrome {
    public static void main(String[] args) {
        checkPalindrome("mom");
    }
    public static boolean checkPalindrome(String str) {
        String reversedString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString += str.charAt(i);
        }
        if (reversedString.equals(str)) {
            return true;
        } else {
            return false;
        }
    }
}
//Python Solution
//def is_palindrome(txt):
//        return txt == txt[::-1]
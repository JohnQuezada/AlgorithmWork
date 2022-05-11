package com.careerdevs.Edabit;

public class SpacesBetweenEachCharacter {
    public static void main(String[] args) {
        spaceMeOut("space");
    }
    public static String spaceMeOut(String str) {
        String newStr = "";
        for (int i = 0; i < str.length()-1; i++) {
            newStr += str.charAt(i) + " ";
        }
        return newStr + str.charAt(str.length()-1);
    }
}
//Python Solution
//def spaceMeOut(s):
//        space = " "
//        return space.join(s)
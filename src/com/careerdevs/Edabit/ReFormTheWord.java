package com.careerdevs.Edabit;

public class ReFormTheWord {

    public static void main(String[] args) {
        getWord("maga", "zine");
    }
    public static String getWord(String left, String right) {
        String outputL = left.substring(0, 1).toUpperCase() + left.substring(1);
        String outputR = right;
        return outputL + outputR;
    }
}

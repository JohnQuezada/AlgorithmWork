package com.careerdevs.Edabit;

public class AddingNumbers {
    public static String add(String a, String b) {
        try {
            int aa = Integer.parseInt(a);
            int bb = Integer.parseInt(b);
            int solution = aa + bb;
            String s = String.valueOf(solution);
            return s;
        } catch (Exception e) {
            return "Invalid Operation";
        }
    }
}

package com.careerdevs.Edabit;

public class ProfitableGamble {
    public static void main(String[] args) {
        profitableGamble(0.2, 50, 9);
    }
    public static boolean profitableGamble(double prob, double prize, double pay) {
        if (prob * prize > pay) {
            return true;
        }
        return false;
    }
}

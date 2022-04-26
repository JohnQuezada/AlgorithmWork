package com.careerdevs.Edabit;

public class MatchstickHouses {
    public static void main(String[] args) {
        matchHouses(1);
    }

    public static int matchHouses(int step) {
        if (step == 0) return 0;
        return (step * 5) + 1;
    }
}

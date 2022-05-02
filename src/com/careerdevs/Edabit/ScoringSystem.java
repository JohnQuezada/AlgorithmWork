package com.careerdevs.Edabit;

public class ScoringSystem {
    public static void main(String[] args) {
        calculateScores("AAB");
    }

    public static int[] calculateScores(String str) {
        int numA = 0;
        int numB = 0;
        int numC = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A') {
                numA++;
            } else if (str.charAt(i) == 'B') {
                numB++;
            } else {
                if (str.charAt(i) == 'C') {
                    numC++;
                }
            }
        }
        int[] scores = {numA, numB, numC};
        return scores;
    }
}
// python solution
//    def calculate_scores(txt):
//        counterA = 0;
//        counterB = 0;
//        counterC = 0;
//        for i in range(0, len(txt)):
//        if txt[i] == 'A':
//        counterA += 1;
//        elif txt[i] == 'B':
//        counterB += 1;
//        elif txt[i] == 'C':
//        counterC += 1
//
//        return [counterA, counterB, counterC];

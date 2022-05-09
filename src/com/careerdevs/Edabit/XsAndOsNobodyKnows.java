package com.careerdevs.Edabit;

public class XsAndOsNobodyKnows {
    public static void main(String[] args) {
        getXO("ooxx");
    }

    public static boolean getXO (String str) {
        int countX = 0;
        int countO = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x' || str.charAt(i) == 'X') {
                countX++;
            }
            if (str.charAt(i) == 'o' || str.charAt(i) == 'Y') {
                countO++;
            }
        }
        if (countX == countO) {
            return true;
        }
        return false;
    }
}
// python solution
//def XO(txt):
//        txt = txt.lower()
//        return txt.count("x") == txt.count("o")
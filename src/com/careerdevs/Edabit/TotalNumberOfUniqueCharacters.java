package com.careerdevs.Edabit;

public class TotalNumberOfUniqueCharacters {
    public static void main(String[] args) {
        countUnique("pip", "geeks");
    }
    public static int countUnique(String s1, String s2) {
        String newStr = s1 + s2;
        String holder = "";
        int counter = 0;
        for (int i = 0; i < newStr.length(); i++) {
            if (holder.indexOf(newStr.charAt(i)) == -1) {
                holder += newStr.charAt(i);
                counter++;
            }
        }
        return holder.length();
    }
}

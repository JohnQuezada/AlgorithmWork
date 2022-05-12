package com.careerdevs.Edabit;

public class MatchTheLastItem {
    public static void main(String[] args) {
        matchLastItem(new String[] {"i", "love", "tesh", "ilovetesh"});
    }
    public static boolean matchLastItem(String[] t) {

        String newStr = "";
        for (int i = 0; i< t.length-1; i++){
            newStr += t[i];
        }
        if(newStr.equals(t[t.length-1])){
            return(true);
        }
        return(false);
    }
}

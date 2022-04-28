package com.careerdevs.Edabit;

import java.util.Arrays;

public class TheThreeProgrammersProblem {
    public static void main(String[] args) {
        programmers(1, 5, 9);
    }
    public static int programmers(int one, int two, int three) {
        int intArray[] = new int[] {one, two, three};
        Arrays.sort(intArray);
        return intArray[2] - intArray[0];
    }
}
// Python
//    def programmers(one, two, three):
//        lst=[one,two,three]
//        return(max(lst)-min(lst))
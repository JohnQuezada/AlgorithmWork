package com.careerdevs.Edabit;

import java.util.Arrays;

public class PerfectSquarePatch {

    public static int[][] squarePatch (int n) {

       int[][] squareArray = new int[n][n];

       for (int i = 0; i < squareArray.length; i++) {
           //System.out.println(Arrays.toString( squareArray[i]));
           for (int j = 0; j < squareArray[i].length; j++) {
               squareArray[i][j] = n;
           }
       }
       return squareArray;
    }

    public static void main(String[] args) {

        int num = 3;

        int[][] square = squarePatch(num);

        System.out.println(Arrays.deepToString((square)));

//        System.out.println("squarePatch("+num+") ->[\n");
//        for (int i = 0; i < square.length; i++) {
//            System.out.println("\t" + Arrays.toString(square[i]));
//        }
//        System.out.println("]");
    }
}

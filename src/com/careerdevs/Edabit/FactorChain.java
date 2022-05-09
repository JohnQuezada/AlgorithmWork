package com.careerdevs.Edabit;

public class FactorChain {
    public static void main(String[] args) {
        factorChain(new int[] { 1, 2, 4, 8, 16, 32 });
    }
    public static boolean factorChain(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % arr[i - 1] != 0) {
                return false;
            }
        }
        return true;
    }
}
// Python Solution
//    def factor_chain(lst):
//        for counter in range(len(lst) - 1):
//        if lst[counter+1] % lst[counter] != 0:
//        return False
//        return True
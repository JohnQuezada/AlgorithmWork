package com.careerdevs.Edabit;

public class CheckIfANumberIsPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(3));
    }
    public static boolean isPrime(int num) {
    for (int i = 2; i <= num/2 ; i++) {
        if (num % i == 0) {
            return false;
        }
    }
		return true;
}
// Alternate Solution
//    if(num == 1) {
//        return false;
//    } else {
//        for(int i = 2; i < num; i++) {
//            if(num % i == 0) return false;
//        }
//        return true;
//    }
}

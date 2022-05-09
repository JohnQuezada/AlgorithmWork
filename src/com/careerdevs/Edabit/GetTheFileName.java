package com.careerdevs.Edabit;

public class GetTheFileName {
    public static void main(String[] args) {
        getFilename("C:/Projects/pil_tests/ascii/edabit.txt");
    }
    public static String getFilename(String path) {
        String[] arrOfPath = path.split("/");
        return arrOfPath[arrOfPath.length - 1];
    }
}
// Python Solution
//lst = path.split('/')
//        return lst[-1]
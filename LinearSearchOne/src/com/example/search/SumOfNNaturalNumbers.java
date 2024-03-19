package com.example.search;

public class SumOfNNaturalNumbers {




    public static void main(String[] args) {

    }


    public static int sumOfNNumbers(int n) {
        if (n == 0) return 0;
        return n + sumOfNNumbers(n-1);
    }



}

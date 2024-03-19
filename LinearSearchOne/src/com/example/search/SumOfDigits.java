package com.example.search;

public class SumOfDigits {

    public static void main(String[] args) {
        int n = 12345, mod, sum = 0;

        while (n > 0) {
            mod = n % 10;
            sum += mod;
            n = n/10;
        }
        System.out.println(sum);

    }




}

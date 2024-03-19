package com.example.search;

public class PrimeNumberOne {

    public static void main(String[] args) {
        int n = 5, flag = 0;
        for (int i = 1; i < n/2 + 1; i++) {
            if (n % i == 0) flag++;
        }

        if (flag == 1) System.out.println("The number is prime.");
        else System.out.println("The number is not a prime.");
    }


}

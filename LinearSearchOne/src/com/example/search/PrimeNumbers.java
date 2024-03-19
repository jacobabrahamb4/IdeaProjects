package com.example.search;

public class PrimeNumbers {

    public static void main(String[] args) {
        int n = 10, flag = 0;

        for (int i = 1; i <= n; i++) {
            flag = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) flag++;
            }

            if (flag == 2) System.out.println("The number is prime.");
            else System.out.println("The number is not prime");


        }




    }

}

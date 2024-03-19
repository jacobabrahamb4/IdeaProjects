package com.example.search;

public class FibonacciSeries {

    public static void main(String[] args) {
        int a = 0, b = 1, n = 10;
        //printFibonacci(n);
        System.out.println(a);
        System.out.println(b);
        int c;
        for (int i = 3; i < n; i ++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }

    public static int printFibonacci(int n) {
        System.out.println(n);
        if ( n == 0) return 0;
        if (n == 1) return 1;
        return printFibonacci(n - 1) + printFibonacci(n - 2);
    }


}

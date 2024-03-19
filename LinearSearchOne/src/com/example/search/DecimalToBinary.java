package com.example.search;

public class DecimalToBinary {
    public static void main(String[] args) {
        fun(7);
    }

    public static void fun (int n) {
        if (n==0) return;
        fun(n/2);
        System.out.print(n%2);
    }





}

package com.example.search;

public class SwapTwoNumberWithoutThirdVariable {

    public static void main(String[] args) {
        int x = 20, y = 40;
        System.out.println("Before swapping: x = " + x + " y = " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After swapping: x = " + x + " y = " + y);

        int a = 10, b = 30;
        System.out.println("Before swapping: a = " + a + " b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping: a = " + a + " b = " + b);

    }



}

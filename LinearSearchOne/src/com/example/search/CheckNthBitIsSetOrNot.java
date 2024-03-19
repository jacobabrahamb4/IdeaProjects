package com.example.search;

public class CheckNthBitIsSetOrNot {

    public static void main(String[] args) {

    }

    public static boolean checkNthBitIsSetOrNot(int number, int n) {
        return (number & (1 << n -1)) > 0;
    }

}

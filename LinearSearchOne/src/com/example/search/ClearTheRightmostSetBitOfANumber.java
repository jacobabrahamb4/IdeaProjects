package com.example.search;

public class ClearTheRightmostSetBitOfANumber {

    public static void main(String[] args) {
        int number = 13;
        System.out.println(clearRightMostBit(number));
    }

    public static int clearRightMostBit(int n) {
        return n & n-1;
    }
}

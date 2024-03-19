package com.example.search;

public class EnableNthBit {

    public static void main(String[] args) {

    }

    public static int enableNthBit(int number, int n) {
        int mask = 1 << n-1;
        return number | mask;
    }

}

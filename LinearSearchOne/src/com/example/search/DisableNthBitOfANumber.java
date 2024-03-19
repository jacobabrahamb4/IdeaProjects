package com.example.search;

public class DisableNthBitOfANumber {



    public static int disableNthBit(int number, int n) {
        int mask = ~(1 << n-1);
        return number & mask;
    }


}

package com.example.search;

public class HasAlternateBitPattern {



    public static boolean hasAlternateBitPattern(int number) {
        int num = number ^ (number >> 1);
        return (num & num + 1) == 0;
    }



}

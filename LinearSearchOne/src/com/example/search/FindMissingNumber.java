package com.example.search;

public class FindMissingNumber {


    public static int findMissingNumber(int[] array) {
        int result = 0;

        for(int i = 0; i < array.length;i++) {
            result = result ^ array[i];
        }

        for (int i = 0; i <= array.length + 1; i++) {
            result = result ^ i;
        }
        return result;
    }



}

package com.example.search;

public class OddOccuringNumberInAnArray {

    public static void main(String[] args) {

    }

    public static int oddOccuringNumber(int[] array) {

        int result = array[0];
        for(int i = 1; i <= array.length -1; i++) {
            result = result ^ array[i];
        }
        return result;
    }


}

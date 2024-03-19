package com.example.search;

public class TestLinearSearch {

    public static void main(String[] args) {
        int[] array = {12, 34, 14, -15, 56, 2};
        System.out.println(linearSearch(array, -15));
    }

    public static int linearSearch(int[] array, int value) {

        for (int i = 0; i < array.length -1; i++) {
            if (array[i] == value) return i;
        }
        return -1;
    }


}

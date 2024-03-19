package com.example.search;

public class TestBinarySearchOne {

    public static void main(String[] args) {
        int[] array = {-12, -4, 0, 5, 12, 34, 78};

    System.out.println(iterativeBinarySearch(array, -4));



    }

    public static int iterativeBinarySearch(int[] array, int value) {
        int start = 0;
        int end = array.length;

        while (start < end) {
            int midpoint = (start + end) / 2;
            if (array[midpoint] == value) {
                return midpoint;
            } else if (array[midpoint] < value) {
                start = midpoint + 1;
            } else {
                end = midpoint;
            }
        }
        return -1;
    }
}

package com.example.search;

public class TestBinarySearchTwo {

    public static void main(String[] args) {
        int[] array = {-12, -4, 0, 5, 12, 34, 78};
        System.out.println(binarySearch(array, -4));
    }

    public static int binarySearch(int[] array, int value) {
        int start = 0;
        int end = array.length - 1;
        int midpoint = 0;
        while (start <= end) {
            midpoint = (start + end)/2;
            if (array[midpoint] == value) return midpoint;
            if (value < array[midpoint]) end = midpoint - 1;
            else start = midpoint + 1;
        }
        return -1;
    }

    public static int binarySearchTwo(int[] array, int value) {
        int start = 0;
        int end = array.length -1;
        int mid = 0;

        while (start <= end) {
            mid = (start + end) / 2;
            if (array[mid] == value) return mid;
            if (value < array[mid]) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }


}

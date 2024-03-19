package com.example.search;

public class SelectionSortOne {

    public static void main(String[] args) {
        int[] array = {-12, -4, 0, 5, 12, 34, 78};
        int[] sortedArray = selectionSort(array);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i]);
        }
    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1 ; i ++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }



}

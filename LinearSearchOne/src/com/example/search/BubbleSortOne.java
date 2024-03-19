package com.example.search;

public class BubbleSortOne {

    public static void main(String[] args) {
        int[] array = {-12, -4, 0, 5, 12, 34, 78};
        int[] sortedArray = bubbleSort(array);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i]);
        }
    }

    public static int[] bubbleSort(int[] array) {

        for(int i = 0; i < array.length -1; i++) {
            for(int j = 0; j < array.length -1 -i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }


}

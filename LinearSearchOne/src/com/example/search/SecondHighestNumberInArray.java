package com.example.search;

public class SecondHighestNumberInArray {

    public static void main(String[] args) {
        int[] array = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };

        int highest = 0, secondHighest = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > highest) {
                secondHighest = highest;
                highest = array[i];
            } else if (array[i] > secondHighest) {
                secondHighest = array[i];
            }
        }
        System.out.println("Second Highest:  " + secondHighest);



    }

}

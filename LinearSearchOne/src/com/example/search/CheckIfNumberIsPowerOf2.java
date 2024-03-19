package com.example.search;

public class CheckIfNumberIsPowerOf2 {



    public static boolean checkIfNumberIsPowerOf2(int number) {
        return ((number & number -1) == 0);
    }

}

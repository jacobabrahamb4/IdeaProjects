package com.example.search;

public class ToggleNthBitOfANumber {

    public static void main(String[] args) {

    }

    public static int toggle(int number, int n) {
        return number ^ (1 << n -1);
    }


}

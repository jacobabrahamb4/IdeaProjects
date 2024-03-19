package com.example.search;

public class CountTheSetBitsInAnInteger {

    public static void main(String[] args) {
        int number = 13;
        System.out.println(countSetBits(number));
    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) count++;
            n = n >> 1;
        }
        return count;
    }

    public static int countSetBitsOne(int n) {
        int count = 0;

        while (n > 0) {
            n = n & n -1;
            count++;
        }
        return count;
    }


}

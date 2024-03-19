package com.example.search;

public class FindOddOrEvenUsingBitwise {

    public static void main(String[] args) {
        int number = 1234;
        if ((number & 1) == 1) {
            System.out.println("Number is odd");
        } else {
            System.out.println("The number id even");
        }
    }




}

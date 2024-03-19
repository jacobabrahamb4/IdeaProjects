package com.example.search;

public class PalindromeTest {

    public static void main(String[] args) {
        String str = "Jacob", reverse = "";
        char[] charArray = str.toCharArray();
        for (int i = charArray.length - 1; i >=0; i--) {
            reverse = reverse + charArray[i];
        }
        System.out.println("reverse:" + reverse);

    }



}

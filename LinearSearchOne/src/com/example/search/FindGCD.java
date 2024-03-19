package com.example.search;

public class FindGCD {

    public static void main(String[] args) {
        System.out.println(findGCD(10, 20));
    }

    public static int findGCD(int n1, int n2) {
        if (n2 == 0) return n1;
        return findGCD(n1, n1%n2);
    }

}

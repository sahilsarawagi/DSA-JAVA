package com.company;

public class Overloading {
    public static void main(String[] args) {
        int ans = sum(4,5,6);
        int ans2 = sum(5,6);
        System.out.println(ans);
        System.out.println(ans2);

    }

    private static int sum(int i, int i1) {
        return i+i1;
    }

    private static int sum(int i, int i1, int i2) {
        return i+i1+i2;
    }
}

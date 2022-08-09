package com.company;

public class NumOfDigit {
    public static void main(String[] args) {
        int n = 4514;
        int b= 10;
        // Digits in binary
        int ans = (int) (Math.log(n) / Math.log(b)) + 1;
        System.out.println(ans);
    }
}

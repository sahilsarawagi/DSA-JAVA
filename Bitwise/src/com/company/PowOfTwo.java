package com.company;

public class PowOfTwo {
    public static void main(String[] args) {
        int n = 31;   // this is exception for zero
        boolean ans = (n&(n-1)) == 0 ;
        if (n==0){
            ans =false;
        }
        System.out.println(ans);
    }
}

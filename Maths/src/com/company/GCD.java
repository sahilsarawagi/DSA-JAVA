package com.company;

public class GCD {
    public static void main(String[] args) {
        System.out.println(gCD(4,6));
    }
    static int gCD(int a, int b){
        if (a==0){
            return b;
        }

        return gCD(b%a,a);
    }
}

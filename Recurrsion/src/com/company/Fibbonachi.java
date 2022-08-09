package com.company;

public class Fibbonachi {
    public static void main(String[] args) {
        int n = 4;
        int fibo= fibbonachi(n);
        System.out.println(fibo);
    }

    private static int fibbonachi(int n) {
        if (n==1){
            return 1;
        }if (n==0){
            return 0;
        }
        // This is not tail recursion
        return fibbonachi(n-1) +fibbonachi(n-2);
    }

}

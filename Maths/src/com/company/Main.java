package com.company;

public class Main {

    public static void main(String[] args) {
        int n=41;
        System.out.println(checkPrime(n));
    }

    private static boolean checkPrime(int n) {
        if (n<=1){
            return false;
        }
        for (int i = 2; i*i <n ; i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}

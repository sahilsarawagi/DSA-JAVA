package com.company;

import java.util.Scanner;

public class QuestionPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPrime(6));
    }

     static boolean isPrime(int n) {
        int i =2;
        while(i*i<n){
            if (n%i==0){
                return false;
            }
            i++;
        }
        return i*i>n;

    }
}

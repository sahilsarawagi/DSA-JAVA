package com.company;

public class Main {

    public static void main(String[] args) {
	print(1);
    }

    private static void print(int n) {
        if (n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        // This is tail recurssion
        // this is last function call
        print(n+1);
    }
}

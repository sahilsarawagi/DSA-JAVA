package com.company;

public class Main {

    public static void main(String[] args) {
//	prin(5);
//	prinRev(5);
	prinBoth(5);
    }

    private static void prin(int n) {
        if (n==0){
            return;
        }
        System.out.println(n);
        prin(n-1);
    }

 private static void prinRev(int n) {
        if (n==0){
            return;
        }
        prinRev(n-1);
        System.out.println(n);
    }
private static void prinBoth(int n) {
        if (n==0){
            return;
        }
        System.out.println(n);
        prinBoth(n-1);
        System.out.println(n);
    }
}

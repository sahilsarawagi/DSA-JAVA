package com.company;

import java.util.Scanner;

public class Q_reverse {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        int reverse=0;
        while (n>0){
            int rem=n%10;
            reverse=rem + reverse*10;
            n/=10;
        }
        System.out.println(reverse);
    }
}

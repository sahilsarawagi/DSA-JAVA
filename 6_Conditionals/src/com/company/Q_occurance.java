package com.company;

import java.util.Scanner;

public class Q_occurance {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        int rem=0;
        int count=0;
        while (n>0){
            rem=n%10;
            n=n/10;
            if (rem==4){
                count++;
            }

        }
        System.out.println(count);
    }
}

package com.company;

import java.util.Scanner;

public class Q_Largest {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//      Q. Find the largest of three
        int max=a ;
        if (b>max){
            max=b;
        }
        if (c>max){
            max=c;
        }
        System.out.println(max);

        System.out.println(Math.max(54,63));
        System.out.println(Math.max(c,Math.max(a,b)));
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Take input of two no. and print sum
    sum();
    int ans=sum2();
        System.out.println(ans);
    int ans2=sum3(4,5);
        System.out.println(ans2);
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        int n1,n2,sum;
        System.out.print("Enter the value of first number: ");
        n1= in.nextInt();
        System.out.print("Enter the value of Second number: ");
        n2= in.nextInt();
        sum=n1+n2;
        System.out.println("Sum of two number is "+ sum);
    }
    static int sum2(){
        Scanner in = new Scanner(System.in);
        int n1,n2,sum;
        System.out.print("Enter the value of first number: ");
        n1= in.nextInt();
        System.out.print("Enter the value of Second number: ");
        n2= in.nextInt();
        sum=n1+n2;
        return sum;
    }
    static int sum3(int i , int l){
        return i+l;
    }

}

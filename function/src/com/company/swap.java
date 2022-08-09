package com.company;

public class swap {
    public static void main(String[] args) {
        int a=5, b=6;
        wrongswapp(a,b);
        System.out.println("Value of a and b is "+ a +"  "+b);

    }

     static void wrongswapp(int a, int b) {
        int temp=a;
        a=b;
        b=temp;
        // this change will be only valid in this function scope only
    }

}

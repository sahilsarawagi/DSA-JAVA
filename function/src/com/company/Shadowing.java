package com.company;

public class Shadowing {
    static int x=55; // this will be shadowed at line 8

    public static void main(String[] args) {
        System.out.println(x); //55
        int x =47;  // the class variable at line 4 shadowed  by this
        System.out.println(x);
        fun();
    }

     static void fun() {
         System.out.println(x);
    }
}

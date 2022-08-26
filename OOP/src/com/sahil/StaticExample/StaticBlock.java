package com.sahil.StaticExample;

public class StaticBlock {
    static int a = 7;
    static int b;
    //  this static block will execute exactly ones, when the class is first loaded
    static {
        System.out.println("Hello, I am static block");
        b=a*a*a;
    }

    public static void main(String[] args) {
        System.out.println(StaticBlock.a + "   " + StaticBlock.b);
    }
}

package com.sahil.Polymorphism;

public class PrintingOveride {

    @Override    // this @Override is just an annotaion (is used to check if the method is overridden or not)
    public String toString() {   // here we are overriding the default Parent class (object class)
        return "Sahil Sarawagi";
    }

    public static void main(String[] args) {
        PrintingOveride a = new PrintingOveride();
        System.out.println(a);

    }
}

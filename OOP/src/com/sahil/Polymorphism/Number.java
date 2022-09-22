package com.sahil.Polymorphism;

public class Number {

        int sum(int a, int b){
            return a+b;
        }
        int sum(int a, int b, int c){
            return a+b+c;
        }


    public static void main(String[] args) {
        Number oj = new Number();
        System.out.println(oj.sum(4,5));;
    }
}

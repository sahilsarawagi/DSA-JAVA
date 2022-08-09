package com.company;

import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args) {
        fun(4,9,3,8,4,9,3,33,48,5,68);
        multiple(5,9,"sahil","sasuke");
    }
    static void fun(int ...v){   // this ...  is an array of int, means we can give any no. of argument to fun , these are known as variable length of arguments
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a, int b, String ...k){

        System.out.println(Arrays.toString(k));
    }
}

package com.company;

public class Operator {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char) ('a' + 3));
        System.out.println("a" + 1 + 2);  // Here 1 and 2 will be converted into Integer wrapper class and it will call toString() method
                                          // so result will be "a" + "1" + "2"


    }
}
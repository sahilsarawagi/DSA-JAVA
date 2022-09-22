package com.sahil.DataHiding;

public class Main {

    public static void main(String[] args) {
        ParentClass oj = new ParentClass();
        ParentClass oj2 = new ParentClass();
        System.out.println(oj.hashCode());

        System.out.println(oj2.hashCode());
    }
}

package com.sahil.AbstractExample;


public class Main {
    public static void main(String[] args) {
        Child obje =new Child();
        obje.abstractMethod();
        obje.abstractMethod();
        Child.iAmStaticMethodInsideAbstractClass();
        Parent.iAmStaticMethodInsideAbstractClass();

        Parent obj  = new Child();   // you can define obj like this also

        System.out.println("Any class that contains one or more abstract " +
                "methods must also be declared abstract.");
    }
}

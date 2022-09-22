package com.sahil.AbstractExample;

public class Child extends Parent{

    @Override
    void abstractMethod() {
        System.out.println("Because i am abstractMethod, " +
                "that's why people have to override me " +
                "in Child class of Abstract Parent Class");

    }

    public Child() {
        super();
    }
}

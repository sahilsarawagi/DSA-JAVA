package com.sahil.Inheritance;

public class Box {
    double l,b,h;
    double weight  = 50.4;
    public Box() {
        this.l= -1;
        this.h= -1;
        this.b= -1;
    }
    static void greeting(){
        System.out.println("hello");
    }
    // cube
    public Box(double side) {
        this.l= side;
        this.h= side;
        this.b= side;
    }
    // rectangle
    public Box(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }
    // old
    public Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.b = old.b;
    }

}

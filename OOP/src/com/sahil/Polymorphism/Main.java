package com.sahil.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shapes1 = new Shapes();
        Shapes shapes2 = new Circle();  // Even though this is of type parent class but we are declaring it of child type
                                        // so it will call area of child class (this is called overriding)
        Circle shapes3 =  new Circle();
        shapes1.area();
        shapes2.area();
        shapes3.area();
    }
}

package com.sahil.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        System.out.println(box1.l + " " + box1.b + " " + box1.h);

        Box box2 = new Box(5.5,6.5,8);
        System.out.println(box2.l + " " + box2.b + " " + box2.h);

        Box box3 = new Box(box2);
        box3.l = 5.8;
        System.out.println(box3.l + " " + box3.b + " " + box3.h);
        //object where as overri

        BoxWeight box4 = new BoxWeight(5.4,85.6,7.9,6.7);
        System.out.println(box4.l + " " + box4.b + " " + box4.h);
        System.out.println("This is weight of super class " + box4.superWeightDisplay());
        System.out.println("This is weight of child class " + box4.childWeightDisplay());

        BoxWeight.greeting();
        //you can inherit static method but cannot override it
        //reason, you can't override is because static method doesn't depend upon
        //object whereas override does
        //this overriding and overloading doesn't apply to instance variable

    }
}

package com.sahil.AbstractExample;

abstract public class Parent {
     abstract void abstractMethod();

     public Parent() {
          System.out.println("hey, I am abstract Method constructor,but Making object of abstract class is" +
                  "not allowed, so you can call me from the constructor of the child class");
     }

     void iAmNotAbstractMethod(){
          System.out.println("I am not Abstract, so no need to override me," +
                  "As you can not make object of Abstract class, so you can call me from " +
                  "the object of child class of this abstract class");
     };
     static void iAmStaticMethodInsideAbstractClass(){
          System.out.println("As you all know I am static, independent from the object " +
                  "And also you cannot override me, that's why i cannot be Abstracted" +
                  "you can call me directly by Parent Class" +
                  "As you can inherit me, so you can also call me by using Child Class");
     }
}


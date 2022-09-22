package com.sahil.DataHiding;

public class ChildClass extends ParentClass {


    public static void main(String[] args) {
        ParentClass parentObject = new ParentClass();
//   int a = parentObject.iAmPrivate ;  // Access is not allowed
        int b = parentObject.iAmProtected; // Access is allowed
        int c = parentObject.iAmPublic; // Access is allowed
        int d = parentObject.noModifier; // Access is allowed

        ChildClass childObject  = new ChildClass();
//    int e = childObject.iAmPrivate; // Access denied
        int f = childObject.iAmProtected ; // Access allowed
        int k = childObject.iAmPublic;    // Access allowed
        int g  = childObject.noModifier;   // Access allowed
    }
}

package com.sahil.DifferntPackageDataHiding;

import com.sahil.DataHiding.ChildClass;

public class ChildClassDifferentPkg extends ChildClass {


    public static void main(String[] args) {
        ChildClassDifferentPkg ObjectChildClassDifferentPkg = new ChildClassDifferentPkg();
//        int w  = ObjectChildClassDifferentPkg.iAmPrivate; // Access denied
        int x = ObjectChildClassDifferentPkg.iAmProtected; // Access allowed
        int y = ObjectChildClassDifferentPkg.iAmPublic;  // Access allowed
//        int z = ObjectChildClassDifferentPkg.noModifier;  // Access denied

    }
}

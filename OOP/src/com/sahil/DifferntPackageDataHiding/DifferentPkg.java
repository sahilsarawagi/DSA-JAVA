package com.sahil.DifferntPackageDataHiding;

import com.sahil.DataHiding.ChildClass;

public class DifferentPkg {
    ChildClass ObjectChildClass = new ChildClass();
//    int e = childObject.iAmPrivate; // Access denied
//    int f = ObjectChildClass.iAmProtected ; // Access denied
    int k = ObjectChildClass.iAmPublic;    // Access  allowed
//    int g  = ObjectChildClass.noModifier;   // Access denied

    ChildClassDifferentPkg ObjectChildClassDifferentPkg = new ChildClassDifferentPkg();
//    int w  = ObjectChildClassDifferentPkg.iAmPrivate; // Access denied
//    int x = ObjectChildClassDifferentPkg.iAmProtected; // Access denied
    int y = ObjectChildClassDifferentPkg.iAmPublic;  // Access allowed
//    int z = ObjectChildClassDifferentPkg.noModifier;  // Access denied

}

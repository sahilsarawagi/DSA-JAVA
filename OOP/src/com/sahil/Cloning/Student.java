package com.sahil.Cloning;
// Shallow copy -> It doesn't make duplicate of non-primitive, it simply points two variable to same location
// if we make changes on any one then change will also occur in another.

// Deep copy -> In this case, It purely makes duplicate of both primitive and non-primitives.
// No changes occur on another, when making any changes in one.

public class Student implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
        arr= new int[]{5,6,8,2};
    }

//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();  // This is shallow copy
//    }


    public Object clone() throws CloneNotSupportedException {
        Student twin = (Student) super.clone();   // This is shallow copy

        // Making Deep copy
        twin.arr = new int[twin.arr.length];
        for (int i=0; i<twin.arr.length;i++){
            twin.arr[i]=this.arr[i];
        }
        return twin;
    }
}

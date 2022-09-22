package com.sahil.Cloning;

import java.util.Arrays;

public class Main  {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student Naruto = new Student(23,"Naruto Uzumaki");
        Student Sasuke = (Student) Naruto.clone();

        System.out.println(Sasuke.age + "  " + Sasuke.name  );
        System.out.println(Arrays.toString(Sasuke.arr));
//
//        Sasuke.arr[0] = 77;
//        // We have made change on Sasuke but it is showing changes on naruto as well
//        // this is shallow cloning
//        System.out.println(Arrays.toString(Sasuke.arr));
//        System.out.println(Arrays.toString(Naruto.arr));
//

        Sasuke.arr[0] = 77;
        // We have made change on Sasuke but it isn't showing changes on naruto
        // this is deep cloning
        System.out.println(Arrays.toString(Sasuke.arr));
        System.out.println(Arrays.toString(Naruto.arr));



    }
}

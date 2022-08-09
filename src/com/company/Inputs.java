package com.company;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter Your roll Number: ");
//        int rollno = input.nextInt();
//        System.out.println("Your Roll number is "+rollno);

//        int a = 25_000_000;  // To write in the form of millions, we can't write like 25,000,000 it will give syntax error, "_" will provide comma to it
//        System.out.println(a);

        String name = input.nextLine();
        System.out.println("Your name is "+name);
        Float height = input.nextFloat();
        System.out.println("Your height is "+height);

    }
}

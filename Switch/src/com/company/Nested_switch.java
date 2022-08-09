package com.company;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

public class Nested_switch {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int EmpId= in.nextInt();
        String Department= in.next();

        switch (EmpId){
            case 1:
                System.out.println("Sasuke Uchiha");
            case 2:
                System.out.println("Madara Uchiha");
            case 3:
                switch (Department){
                    case "IT":
                        System.out.println("department of IT");
                    case "Management":
                        System.out.println("Mangemtn");
                }
        }
    }
}

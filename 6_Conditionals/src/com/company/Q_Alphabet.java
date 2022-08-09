package com.company;

import java.util.Scanner;

public class Q_Alphabet {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        char ch= in.next().trim().charAt(0);   // trim basically remove the space that are before character and charAt(0) will take char at 0th index

        if (ch>='a' && ch<='z'){
            System.out.println("Your input is lower case");
        }else{
            System.out.println("Your input is Upper case");
        }
    }
}

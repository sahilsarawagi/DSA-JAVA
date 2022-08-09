package com.company;

import java.io.*;
import java.util.*;

public class Solution2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        while(n!=0){
            String username = in.next();
            n--;
        if(check(n,username)){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
        }


    }
    static boolean check(int n, String username){


            if(username.length()<=8 && username.length()>=30){
                return false;
            }
            for(int i=0; i<username.length(); i++){
                if((username.charAt(i) >= 'a' && username.charAt(i) <= 'z') || (username.charAt(i) >= 'A' && username.charAt(i) <= 'Z') || username.charAt(i)=='_'){
                    int b=0;
                }else {return false;}
            }


        return true;
    }
}

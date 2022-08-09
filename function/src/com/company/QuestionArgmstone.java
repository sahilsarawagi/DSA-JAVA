package com.company;

import java.util.Scanner;

public class QuestionArgmstone {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        boolean ans = isArgmstone(num);
        System.out.println(ans);
    }

     static boolean isArgmstone(int num) {
        int i=0;
        int ans=num;
        while(num>0){
            int rem = num%10;
             i= (rem * rem * rem) + i;
            num=num/10;


        }
        if (ans==i ){
            return true;
         }
        return false;
//        or return ans==i;
    }
}

package com.company;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
//        factor1(20);
//        System.out.println();
//        factor2(36);
        //Sorted
        factor3(36);
    }

    private static void factor2(int fac) {
        for (int i = 1; i*i <=fac ; i++) {
            if (fac%i == 0){
                if (fac/i ==i){
                    System.out.println(i);
                }
                else {
                    System.out.print(i + " " + fac / i + " ");
                }
            }
        }
    }

    private static void factor3(int fac) {
        ArrayList<Integer> li = new ArrayList<Integer>();
        for (int i = 1; i*i <=fac ; i++) {
            if (fac%i == 0){
                if (fac/i ==i){
                    System.out.print(i + " ");
                }
                else {
                    System.out.print(i + " ");
                    li.add(fac/i);
                }
            }

        }
        for (int j = li.size()-1; j > 0; j--) {
            System.out.print(li.get(j) +" ");
        }
    }



    private static void factor1(int fac) {
        for (int i = 1; i <= fac; i++) {
            if (fac%i==0){
                System.out.print(i + " " );
            }
        }
    }
}

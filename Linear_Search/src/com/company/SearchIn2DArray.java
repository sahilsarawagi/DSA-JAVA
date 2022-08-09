package com.company;

import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {
        int[][] arr= {
                {15,96,452},
                {47,5},
                {789,44,10,523,45,4}
        };

        System.out.println(Arrays.toString(found(arr,523)));
    }

     static int[] found(int[][] arr,int target) {
         int[] a;
         for (int row = 0; row < arr.length; row++) {
             for (int col = 0; col < arr[row].length; col++) {
                 if (arr[row][col]==target){
                     a= new int[]{row, col};
                     return a ;
                 }

             }

         }
         return  new int[]{-1,-1};
    }
}

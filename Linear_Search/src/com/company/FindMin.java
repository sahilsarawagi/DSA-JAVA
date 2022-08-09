package com.company;

public class FindMin {
    public static void main(String[] args) {
        int[] arr ={14,56,47,2,3,6,258,123};
        System.out.println(minimum(arr));
    }

     static int minimum(int[] arr) {
        int min=arr[0];
         for (int i = 0; i < arr.length; i++) {
             if(min>arr[i]){
                 min=arr[i];
             }
         }
         return min;
    }
}

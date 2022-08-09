package com.company;

import java.util.Arrays;

public class Power {
    public static void main(String[] args) {
        int[] arr= {3,2,3,2,3,3};
        System.out.println(Arrays.toString(arr));
       int ans =  bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);
    }

    static int bubbleSort(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped=false;
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j-1]>arr[j]){
                    int temp= arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
                if(!swapped){
                    break;
                }
            }
        }
        if (arr.length%2 == 0){
            if (arr[arr.length/2]==arr[0]){
                return arr[0];
            }
            if (arr[arr.length/2+1]==arr[arr.length-1]){
                return arr[arr.length-1];
            }
        }
        return arr[arr.length/2];

    }
}

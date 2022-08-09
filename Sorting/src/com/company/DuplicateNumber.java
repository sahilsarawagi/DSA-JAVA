package com.company;

import java.util.Arrays;

class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        findDuplicate(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(findDuplicate(arr));

    }

     public static int findDuplicate(int[] arr) {
        int i=0;
        while (i< arr.length){
            int correct = arr[i]-1;
            if (arr[i]!=arr[correct]){
                swapp(arr,i,correct);
            }
            else {
                i++;
            }
        }
         for (int j = 0; j < arr.length; j++) {
             if (arr[j]!=j+1){
                 return arr[j];
             }
         }
         return i;
     }

    static void swapp(int[] arr, int first , int second) {
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]=temp;
    }

}
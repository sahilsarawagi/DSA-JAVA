package com.company.RecursiveSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr ={4,3,2,1};
        int row=5 ;
        int col=5;
        selectionSort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr, int row, int col,int maxIndex) {
        if (row <1){return;}
        if(col<row){
            if (arr[col]> arr[maxIndex]){
                selectionSort(arr,row,++col,col);
            }else {
                selectionSort(arr,row,++col,maxIndex);
            }

        }else {
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[row-1];
            arr[row-1] = temp;
            selectionSort(arr,--row,0,0);
        }






    }

}

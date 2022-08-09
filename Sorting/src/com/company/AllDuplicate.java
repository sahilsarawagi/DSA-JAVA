package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllDuplicate {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List <Integer> li = new ArrayList<>();
        cyclicSort(arr);
        System.out.println(cyclicSort(arr));




    }

    static List<Integer> cyclicSort(int[] arr) {
        List <Integer> li = new ArrayList<>();
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
                li.add(arr[j]);
            }
        }
        return li;
    }

    static void swapp(int[] arr, int first , int second) {
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]=temp;
    }
}

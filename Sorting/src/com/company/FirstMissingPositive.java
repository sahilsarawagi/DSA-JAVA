package com.company;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {0,1,2};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(cyclicSort(arr));

    }

    static int cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (correct >= 0 && correct < arr.length) {
                if (arr[i] != arr[correct]) {
                    swapp(arr, i, correct);
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }
        int check =1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j]!=check){
                    continue;
                }else {
                    check++;
                }
            }

        return check;
    }

    static void swapp(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
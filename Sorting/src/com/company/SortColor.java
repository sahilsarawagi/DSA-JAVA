package com.company;

import java.util.Arrays;

public class SortColor {
    public static void main(String[] args) {
        int[] arr = {2,2,1,0,1,1};
        sortColors(arr);
    }
//    public static void sortColors(int[] arr) {
//        int a=0,b=0;
//        for (int k : arr) {
//            if (k == 0) {
//                a++;
//            } else if (k == 1) {
//                b++;
//            }
//        }
//        for (int j = 0; j < arr.length; j++) {
//            if (a!=0){
//                arr[j]=0;
//                a--;
//            }
//            else if (b!=0){
//                arr[j]=1;
//                b--;
//            }
//            else {
//                arr[j]=2;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//    }
    public static void sortColors(int[] nums) {
        int zeroIndex = 0, twoIndex = nums.length - 1, i = 0;
        while( i <= twoIndex ) {
            if( nums[i] == 0 )
                swap(nums, zeroIndex++, i++);
            else if( nums[i] == 2)
                swap(nums, twoIndex--, i);
            else
                i++;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}


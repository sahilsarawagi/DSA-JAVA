package com.company;
// FInd if arr is sorted or not
public class Main {

    public static void main(String[] args) {
        int[] arr ={1,2,4545,8,68,2,87,56};
        System.out.println(isSorted(arr,0));
    }

    private static boolean isSorted(int[] arr,int i) {
        if (i==arr.length-1){
            return true;
        }
        if (arr[i+1]>arr[i]){
            return isSorted(arr,i+1);
        }
        return false;
    }
}

package com.company;

public class Find {
    public static void main(String[] args) {
        int[] arr = {1,54,94,34,9};
        int target = 1;
        System.out.println(isExist(arr,target,0));
    }

    private static boolean isExist(int[] arr, int target, int i) {
    if (i==arr.length){
        return false;
    }
    if (arr[i]!=target) {
        return isExist(arr,target,i+1);
    }
        return true;
    }
}

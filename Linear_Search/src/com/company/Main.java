package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1,5,9,7,5,3,8,7,45,1,4454,1,12,12,95,6};
        int ans=linearSearch(arr,5);
        System.out.println(ans);

    }
    static int linearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                return i;
            }

        }
        return -1;

    }
}

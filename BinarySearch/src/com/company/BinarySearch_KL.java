package com.company;

public class BinarySearch_KL {
    public static void main(String[] args) {
        int[] arr ={-22,-15,0,9,23,45,66,88,93,123};
        int ans= binarySearch(arr,22);
        System.out.println(ans);

    }

    static int binarySearch(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
    while (start<=end){
        int mid= start +(end-start)/2; //might be possible that (start+end)/2 exceed the range of int
        if (target<arr[mid]){
            end=mid-1;
        }else if (target>arr[mid]){
            start=mid+1;
        }else return mid;


    }
        return -1;
    }
}


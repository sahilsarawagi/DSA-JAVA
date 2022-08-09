package com.company;

public class Main {

    public static void main(String[] args) {
	int[] arr={1,2,3,4,5,6,7,8,9};
    int ans=binarySearch(arr,9);
        System.out.println(ans);

    }
    static int binarySearch(int[] arr, int target){
        int start =0;
        int end = arr.length;
        int mid= (start+end)/2;
        for (int i = start; start <end ; i++) {
            mid= (start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if (target > arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }


        }
        return -1;
    }
}

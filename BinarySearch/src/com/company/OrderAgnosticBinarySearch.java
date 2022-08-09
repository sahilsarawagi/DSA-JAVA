package com.company;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr={45,22,12,6,3,-55,-99};
        int ans=orderAgnostic(arr,-55);
        System.out.println(ans);
    }

    static int orderAgnostic(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        //Find wheter array is acending or descending
        boolean isAscending=arr[start]<arr[end];


        while (start<=end){
            int mid= start +(end-start)/2; //might be possible that (start+end)/2 exceed the range of int
            if (target==arr[mid]){
                return mid;
            }
           if (isAscending){
               if (target<arr[mid]){
                   end=mid-1;
               }else {
                   start=mid+1;
               }

           }
           else {
               if (target<arr[mid]){
                   start=mid+1;
               }else {
                   end=mid-1;
               }


           }

        }
        return -1;
    }
}

package com.company;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {6,7,1,2,3,4,5};
        for (int i = 0; i <= arr.length; i++) {
            int ans = rotatedBinarySearch(arr,i, 0, arr.length-1);
            System.out.println("target is "+i + " and its index is "+ans);
        }

    }

    private static int rotatedBinarySearch(int[] arr, int target, int s ,int e) {
        if (s>e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if (arr[mid]==target){
            return mid;
        }
        if (arr[s]<=arr[mid]) {
            if (target <= arr[mid] && target >= arr[s]) {
                return rotatedBinarySearch(arr, target, s, mid - 1);
            } else {
                return rotatedBinarySearch(arr, target, mid + 1, e);
            }
        }
            if (target>=arr[mid] && target<=arr[e]){
                return rotatedBinarySearch(arr,target,mid+1,e);
            }
        return rotatedBinarySearch(arr, target, s, mid - 1);

    }
}

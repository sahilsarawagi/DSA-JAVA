package com.company;

import java.util.ArrayList;

public class FindIndex  {
    public static void main(String[] args) {
        int[] arr={1,3,5,6,5,8,9};
        ArrayList<Integer> ans = findIndex(arr, 5, 0);
        System.out.println(ans);
    }

    private static ArrayList<Integer> findIndex(int[] arr, int target , int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length){
            return list;
        }
        if (arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> AnswerfromBelowCalls =  findIndex(arr,target,index+1);
        list.addAll(AnswerfromBelowCalls);
        return list;
    }
}
 // This is not optimized way to do this question, bcos array list are being created again and again
// instead use the Arraylist in the argument
// we use this method, just to show how u can do this question without creating Arraylist outside find index function or using in as the Argument
// we wanted to solve this question by creating arraylist inside the function.
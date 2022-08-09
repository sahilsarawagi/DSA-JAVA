package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumOperation {
    public static void main(String[] args) {
        int n = 3;
        int[] arr = {1, 2, 3};
        int[] brr = {2, 1, 3};
        System.out.println(min_operations(n,arr,brr));

    }
   public static int min_operations(int n, int[] arr, int[] brr) {
        int count =0;
        List<int[]> ar=  Arrays.asList(arr);
        List<int[]> br=  Arrays.asList(brr);
        while (n!=0){
            rever(ar,0,n-2);
            count++;
            if (ar.equals(br)){
                ar.remove(0);
                br.remove(0);
                n--;
                count++;
            }
        }
        return count;
    }
    private static List rever(List arr, int start, int end) {
        for (int i = 0; end> start; i++) {
            int temp = (int) arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;

        }
        return arr;
    }

}

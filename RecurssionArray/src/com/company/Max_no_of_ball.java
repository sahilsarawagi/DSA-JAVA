package com.company;

import java.util.ArrayList;

public class Max_no_of_ball {
    public static void main(String[] args) {
        int [][] arr ={{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
        int ans = points(arr);
        System.out.println(ans);
    }

    private static int points(int[][] arr) {
//        ArrayList<Integer> list = new ArrayList<>();
        int max =0;
        for (int i = 0; i < arr.length-1; i++) {
            int count = 0;
            int x_diff = arr[i+1][0] - arr[0][0];
            int y_diff = arr[i+1][1] - arr[i+1][1];
            for (int j = 0; j < arr.length-1; j++) {
                int next_x_diff  = arr[j+1][0] - arr[0][0];
                int next_y_diff =  arr[j+1][1] - arr[j+1][1];
                if (next_x_diff*y_diff==next_y_diff*x_diff){
                    count++;
                }
            }
            System.out.println(count);
            if (count>max){
                max=count;
            }
        }
        return max+1;
    }
}

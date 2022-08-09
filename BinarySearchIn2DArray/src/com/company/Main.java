package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[][] matrix = {
            {4,9,10},
            {7,11,12},
            {16,20,25},
            {21,23,28}
    };
    int[] ans= rowColMatrix(matrix,13);
        System.out.println(Arrays.toString(ans));
    }
    static int[] rowColMatrix(int[][] Matrix,int target){
        int r=0;
        int c= Matrix[r].length-1;
        while (r < Matrix.length && c>=0){
            if (Matrix[r][c]==target){
                return new int[] {r,c};
            }
            else if (Matrix[r][c]<target){
                r++;
            }
            else {
                c--;
            }
        }
        return new int[] {-1,-1};
    }
}

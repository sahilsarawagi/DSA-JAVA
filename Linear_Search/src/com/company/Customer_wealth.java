package com.company;

public class Customer_wealth {
    public static void main(String[] args) {
        int [][] wealth={
                {1,5,9,5},
                {4,8,6,3},
                {7,6,89,4},
                {7,1,25}
        };
        int ans=wealthFinder(wealth);
        System.out.println(ans);
    }

     static int wealthFinder(int[][] wealth) {
        int max= Integer.MIN_VALUE;
        int sum=0;
         for (int row = 0; row < wealth.length; row++) {
             for (int col = 0; col < wealth[row].length; col++) {
                 sum=sum+wealth[row][col];
             }
             if (sum>max){
                 max=sum;
             }
             sum=0;
         }
         return max;
    }
}

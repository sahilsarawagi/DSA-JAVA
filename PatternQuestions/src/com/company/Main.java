package com.company;

public class Main {

    public static void main(String[] args) {
//        pattern1(4);
//        System.out.println();
//        pattern2(4);
//        System.out.println();
//        pattern3(4);
//        System.out.println();
//        pattern4(4);
//        System.out.println();
//        pattern30(5);
        pattern31(3);
    }

    private static void pattern31(int i) {
        int originalI =i;
        int n =2*i ;
        for (int row = 0; row < n ; row++) {
            for (int col = 0; col <=n ; col++) {
                int atEveryIndex = originalI - Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

    private static void pattern5(int i) {
//        pattern2(i);
//        pattern3(i-1);
        for (int row = 1; row <= 2*i-1; row++) {
            int totalrow = row>i ? 2*i-row : row;
            for (int col = 1; col <=  totalrow; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    private static void pattern28(int i) {
        for (int row = 1; row <= 2*i-1; row++) {
            int totalspace = row<i ? i-row : row-i;
            for (int col = 1; col <=  totalspace; col++) {
                System.out.print(" ");
            }
            int totalrow = row>i ? 2*i-row : row;
            for (int col = 1; col <=  totalrow; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    private static void pattern30(int i) {
        for (int row = 1; row <= i; row++) {
            int totalspace = row<i ? i-row : 0;
            for (int col = 1; col <=  totalspace; col++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col +" " );
            }
             for (int col = 2; col <= row; col++) {
                System.out.print(col + " " );
            }
            System.out.println();
        }
    }

    private static void pattern4(int i) {
        for (int row = 1; row <= i; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            // when one row is printed, we need to add new line
            System.out.println();
        }
    }


    private static void pattern3(int i) {
        for (int row = 1; row <= i; row++) {
            for (int col = row; col <= i; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern1(int i) {
        for (int row = 1; row <= i; row++) {
            for (int col = 1; col <=i; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            // when one row is printed, we need to add new line
            System.out.println();
        }
    }
}

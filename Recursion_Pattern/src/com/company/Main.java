package com.company;

public class Main {

    public static void main(String[] args) {
        int n =4;
        int row =1;
        int col = 0;
	recurssivePattern2(row,col);
    }

    private static void recurssivePattern(int row, int col) {
        if (col<=row){
            if (row==col){
                System.out.println();
                recurssivePattern(--row,0);
            }
            else {
                System.out.print("*");
                recurssivePattern(row, ++col);
            }
        }
    }
    private static void recurssivePattern2(int row, int col) {
        if (col<=row){
            if (row==4){
                return;
            }
            if (row==col){
                System.out.println();
                recurssivePattern2(++row,0);
            }
            else {
                System.out.print("*");
                recurssivePattern2(row, ++col);
            }
        }
    }
}

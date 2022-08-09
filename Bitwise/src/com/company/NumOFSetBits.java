package com.company;

public class NumOFSetBits {
    public static void main(String[] args) {
        int n = 45 ;
        int ans = setBits(n);
        System.out.println(ans);
        // Or we can do this
        int ans2 =setBits2(n);
        System.out.println(ans2);
    }

    private static int setBits(int n) {
        int count =0;
        while (n>0){
            count++;
            n = n - (n & (-n));

        }
        return count;
    }

    private static int setBits2(int n) {
        int count =0;
        while (n>0){
            count++;
            n = (n & (n-1));

        }
        return count;
    }
}

package com.company;

public class Reverse {
    public static void main(String[] args) {
//        revers1(7435);
        int ans =revers2(7469);
        System.out.println(ans);

    }
    static int sum =0;
    private static void revers1(int n) {
        if (n==0){
            System.out.println(sum);
            return ;
        }
        int rem=(n%10);
        sum =sum*10+rem;
        revers1(n/10);
    }
    private static int revers2(int n){
        int digit = (int) Math.log10(n) + 1 ;
        return helper(n,digit);

    }

    private static int helper(int n, int digit) {
        if (n==0){
            return 0;
        }
        return (int) ((n%10)*(Math.pow(10,digit-1)) + helper(n/10,digit-1));
    }
}

package com.company;

public class CountZeroes {
    public static void main(String[] args) {
        int ans = count(5704560);
        System.out.println(ans);
    }

    private static int count(int n) {
        return helpppp(n,0);
    }

    private static int helpppp(int n ,int c) {
        if (n==0){
            return c;
        }
       int rem=n%10;
        if (rem==0){
            return helpppp(n/10,c+1);
        }
        return helpppp(n/10,c);
    }
}

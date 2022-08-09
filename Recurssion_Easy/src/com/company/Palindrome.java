package com.company;

public class Palindrome {
    public static void main(String[] args) {
        boolean ans = isPalin(12321);
        System.out.println(ans);
    }
        static boolean isPalin(int n) {
            int dig= (int) Math.log10(n);
            int first = (int) (Math.pow(10,dig));
            int last = 10;
            return helperr(first,last,n);
        }

        static boolean helperr(int first, int last, int n) {
            if (n==0){
                return true;
            }
            if (n/first == n%last){
                return helperr(first/10,last,n/10);
            }
            return false;
        }

}

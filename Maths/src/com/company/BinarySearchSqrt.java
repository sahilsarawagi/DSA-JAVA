package com.company;

public class BinarySearchSqrt {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;   //Precision, decimal points
        for (int i = 1; i < n; i++) {
            double ans = suareqrt(i,p);
            System.out.println("sqrt of "+i +" is "+ans );
            System.out.printf("%.3f",ans);
            System.out.println();
        }

    }

    private static double suareqrt(int n, int p) {
        double root =0.0;
        int end = n;
        int start =0;
        int mid =0;
        while (start<=end){
             mid = start + (end-start)/2;
            if (mid * mid == n){
                return mid;
            }
            if (mid*mid>n){
                end = mid -1;
            }else {
                start = mid + 1 ;
            }
        }
        mid = mid -1;
        double deci =0.0;
        root = mid +deci;
        double incri = 0.1;
        for (int i = 0; i < p; i++) {
            while(root*root<=n){
                root += incri;
            }
            root -= incri;
            incri/=10;
        }
        return root;
    }
}

package com.company;

public class NewtonSQrt {
    public static void main(String[] args) {
        System.out.println(sqrrt(9));
    }

    private static double sqrrt(double n) {
        double x=n;
        double root;
        while (true){
            root = 0.5*(x + n/x);
            if (Math.abs(root-x)<0.1){
                break;
            }
            x=root;
        }
        return root;
    }
}

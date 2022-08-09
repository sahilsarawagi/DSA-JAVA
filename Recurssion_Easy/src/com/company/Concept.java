package com.company;

public class Concept {
    public static void main(String[] args) {
        int ans=funJ(5);
        System.out.println(ans);
    }

    private static int funJ(int i) {
        if (i==0){
            return 0;
        }
        System.out.println(i);
//        return funJ(i--);/// This will give errorrr

        return funJ(--i);
    }
}

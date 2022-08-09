package com.company;

public class SumOFDigit {
    public static void main(String[] args) {
        int ans = sumDigits(1566);
        System.out.println(ans);
    }

    private static int sumDigits(int dig) {
            if (dig==0){
                return 0;
            }
            return dig%10 + sumDigits(dig/10);

    }
}

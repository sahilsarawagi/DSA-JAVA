package com.company;

public class SingleNumber {
    public static void main(String[] args) {
    int[] arr ={4,1,2,1,2};
    }
    public int singleNumber(int[] arr) {
        int unique = 0;
        for (int j : arr) unique ^= j;
        return unique;
    }
}

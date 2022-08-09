package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr ={1,68,69,32,5};
        changeValue(arr);
        System.out.println(Arrays.toString(arr));

    }

     static void changeValue(int[] num) {
        num[0]=23;
    }
}

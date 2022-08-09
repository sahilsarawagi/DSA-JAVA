package com.company;

import java.util.Arrays;

public class Search_In_String {
    public static void main(String[] args) {
        String str ="Sahil";
        char target = 'h';
       boolean ans=linearSearchSting(str,target);
        System.out.println(ans);

        // using foreach loop
        boolean result=linearSearchSting2(str,target);
        System.out.println(result);

//        printing str in character array form
        System.out.println(Arrays.toString(str.toCharArray()));



    }

    private static boolean linearSearchSting2(String str, char target) {
        if(str==null){
            return false;
        }
        for (char ch :
                str.toCharArray()) {
            if (ch == target){
                return true;
            }
        }
        return false;
    }

    static boolean linearSearchSting(String str, char target) {
        if(str==null){
            return false;
        }
         for (int i = 0; i < str.length(); i++) {
             if (str.charAt(i)==target){
                 return true;
             }

         }
        return false;
    }



}

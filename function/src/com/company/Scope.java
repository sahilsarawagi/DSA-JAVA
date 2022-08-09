package com.company;

public class Scope {
    public static void main(String[] args) {
        int a=36;

        {
            int k = 45;
          //  int a =5 ;  // this will give error you cannot intilize value that has been already intilized in the functiion in which your block is
          a=32;
//          value intilized will in this block will remain in block

        }
//        k =54 ;  // this will give error, block stuff cant be accessed outside the block

    }
}

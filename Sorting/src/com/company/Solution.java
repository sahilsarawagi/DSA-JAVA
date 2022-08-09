package com.company;

import javax.swing.plaf.IconUIResource;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int q= in.nextInt();
        while(q>0){
            q--;
            int n= in.nextInt();
            int leap = in.nextInt();
            int[] game= new int[n];
            for(int i=0; i<n;i++){
                game[i]=in.nextInt();
            }
           boolean result= canWin(leap,game,0);
            System.out.println(result);
        }
        // System.out.println(q+ " "+n + " "+ leap+ " " + game[0]);

    }

    static boolean canWin(int leap , int[] game,int position){
        boolean win= false;
        if (position+leap>game.length){
            return win;
        }
        if (game[position+leap]==0){
            canWin(leap,game,position);
        }
        return !win;
    }
}
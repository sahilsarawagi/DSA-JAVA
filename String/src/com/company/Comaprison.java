package com.company;

public class Comaprison {
    public static void main(String[] args) {
        // Here we will prove that string with same content point to same place
        String a= "Sahil";
        String b= "Sahil";
        System.out.println(a==b);

        String c = new String("Sahil");
        String d  = new String("Sasuke");
        System.out.println(c==d);
        Integer num = 5;
    }
}

package com.sahil.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] input;
    private static int DEFAULT_SIZE=5;
    private int size = 0;

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "input=" + Arrays.toString(input) +
                ", size=" + size +
                '}';
    }

    public CustomArrayList() {
        this.input = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if (isFullSize()){
            resize();
        }
        else {
            input[size]=num;
            size++;
        }
    }
    private Boolean isFullSize(){
        return size == input.length;
    }
    private void resize(){
        int[] temp = new int[2*input.length];
        for (int i = 0; i < input.length ; i++) {
            temp[i] = input[i];
        }
        input = temp;
    }
//        ArrayList<Integer> list = new ArrayList<>();
    public int size(){
        return size;
    }
    public int get(int index){
        return input[index];
    }
    public void remove(){
        size--;
    }
    public void set(int index, int value){
        input[index] = value;
    }

}

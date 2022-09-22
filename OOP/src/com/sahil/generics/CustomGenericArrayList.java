package com.sahil.generics;

import java.util.Arrays;

public class CustomGenericArrayList<T> {
    private Object[] input;
    private static int DEFAULT_SIZE=5;
    private int size = 0;

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "input=" + Arrays.toString(input) +
                ", size=" + size +
                '}';
    }

    public CustomGenericArrayList() {
        this.input = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
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
        Object[] temp = new Object[2*input.length];
        for (int i = 0; i < input.length ; i++) {
            temp[i] = input[i];
        }
        input = temp;
    }
//        ArrayList<Integer> list = new ArrayList<>();
    public int size(){

        return size;
    }
    public T get(int index){

        return (T) input[index];
    }
    public void remove(){
        size--;
    }
    public void set(int index, T value){
        input[index] = value;
    }

}

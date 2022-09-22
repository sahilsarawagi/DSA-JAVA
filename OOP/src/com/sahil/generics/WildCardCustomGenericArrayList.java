package com.sahil.generics;

import java.util.Arrays;
import java.util.List;

public class WildCardCustomGenericArrayList<T extends Number> { // Because of this wildcard, now we can only provide things that are inside Number class
                                                                // Now we can give Type of String bcos it is not inside Number class
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

    public WildCardCustomGenericArrayList() {
        this.input = new Object[DEFAULT_SIZE];
    }


    // This syntax will only take input that are only inside Number class

//    public void getList(Number list) {
//        // do something
//    }
//
    // This syntax will only take input that are  inside Number class as well as subclass of Number class

//    public void getList(List<? extends Number> list) {
//        // do something
//    }

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




    public static void main(String[] args) {

        WildCardCustomGenericArrayList<Integer> li = new WildCardCustomGenericArrayList<>();
        for (int i = 0; i < 50; i++) {
            li.add(i);
        }
        System.out.println(li);
        System.out.println(li.size());
        System.out.println(li.get(5));
        li.remove();
        li.add(1);
        li.set(4,99);
        System.out.println(li);

    }
}

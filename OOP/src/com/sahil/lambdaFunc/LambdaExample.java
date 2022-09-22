package com.sahil.lambdaFunc;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaExample{

    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

//        list.forEach(i -> System.out.println(i*5));

        Consumer<Integer> fun =(item)-> System.out.println(item*4);
        list.forEach(fun);

        Operation sum = (a,b)-> a+b;
        Operation multi = (a,b)-> a*b;
        Operation subtract = (a,b)-> a-b;

        LambdaExample Calc =new LambdaExample();
        System.out.println(Calc.operate(4,8,sum));
        System.out.println(Calc.operate(4,8,multi));
        System.out.println(Calc.operate(4,8,subtract));

    }
    private  int operate(int a, int b , Operation op){
        return op.operation(a,b);
    }

}
interface Operation{
    int operation(int a, int b);
}
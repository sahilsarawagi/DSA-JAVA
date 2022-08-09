package com.company;

public class Conditionals {

    public static void main(String[] args) {
	int salary= 52335;
    if (salary>20000){
        salary+=3000;
    }
    else if (salary>10000){
        salary+=2000;
    }
    else {
        salary+=1000;
    }
        System.out.println(salary);
    }
}

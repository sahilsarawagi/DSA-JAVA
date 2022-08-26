package com.sahil.StaticExample;
// These are the  cars in a showroom
public class Cars {
    int price;
    String color;
    float speed;
    static int noOfCarsInShowroom ;
     int noOfCarsInShowroomWithoutStatic ;

    public Cars(int price, String color, float speed) {
        this.price = price;
        this.color = color;
        this.speed = speed;
        Cars.noOfCarsInShowroom+=1 ;       // this property is not car specific, it is specific to showroom that's why Cars.
        this.noOfCarsInShowroomWithoutStatic+=1 ;    
    }
}

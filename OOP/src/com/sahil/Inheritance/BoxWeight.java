package com.sahil.Inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }
    BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }
    public BoxWeight(double l, double b, double h, double weight) {
        super(l, b, h);
        this.weight = weight;
    }
    double superWeightDisplay(){
        return super.weight;
    }double childWeightDisplay(){
        return this.weight;
    }


}

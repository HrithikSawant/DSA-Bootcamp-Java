package com.oops.properties.inheritance;

public class BoxWeight extends Box{

    double weight;


    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        //when you want to initialize values present in parent class
        super(l, h, w);//call the parent class constructor
        this.weight = weight;
    }

    public BoxWeight(BoxWeight other) {
        super(other);
    }

    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }
}

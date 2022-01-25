package com.oops.properties.polymorphism;

public class Triangle extends Shapes{

    //this wil run when obj of Circle is created
    // hence it is overriding the parent method
    @Override // this is called annotation
    void area() {
        System.out.println("Area is 0.5 * h * b");
    }
}

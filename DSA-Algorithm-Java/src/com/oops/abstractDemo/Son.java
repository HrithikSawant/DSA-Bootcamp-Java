package com.oops.abstractDemo;

public class Son extends Parent{



    public Son(int age) {
        super(age);
    }


    @Override
    void normal() {
        super.normal();
    }

    @Override
    void career() {
        System.out.println("I want to be Software Engineer");
    }

}

package com.oops.abstractDemo;

public abstract class Parent {
    int age ;

    public Parent(int age) {
        this.age = age;
    }

     abstract void career();

    void normal(){
        System.out.println("Welcome World");
    }

    public static void hello(){
        System.out.println("Hey");
    }

}

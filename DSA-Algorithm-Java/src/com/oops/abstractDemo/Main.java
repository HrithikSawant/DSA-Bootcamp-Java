package com.oops.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(12);
        son.career();
        son.normal();

        Daughter daugter = new Daughter(20);
        daugter.career();

        //Abstract class does not have body
        // you can declare variable
        //you can declare method without body
        // you cannot create a object of an abstract class;
        // abstract constructor are not allowed
        // you cannot create abstract static method,
        // but you can create static method in abstract classes



    }

}

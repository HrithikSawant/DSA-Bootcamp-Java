package com.oops.singleton;

public class Main {
    public static void main(String[] args) {
        //all 3 the obj are pointing to same object


        Singleton obj =  Singleton.getInstance();

        Singleton obj1 = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj);
        System.out.println(obj1);
    }
}

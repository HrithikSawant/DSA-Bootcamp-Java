package com.oops.InterfaceDemo;

public interface Engine {

    void start();
    void stop();
    void acc();

    public interface MyInterface{
        void mystart();
    }


    //use multiple interface
    //variable in interface are static and fixed
    //interface can extend another interface
    //Hierarchy doesn't matter in interface
    // for ambiguity or same one we can create a new class to avoid misconfig
    //
}

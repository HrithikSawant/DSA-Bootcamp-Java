package com.oops.InterfaceDemo;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("ElectricEngine Started");
    }

    @Override
    public void stop() {
        System.out.println("ElectricEngine Stopped");
    }

    @Override
    public void acc() {
        System.out.println("ElectricEngine Accelerated");
    }
}

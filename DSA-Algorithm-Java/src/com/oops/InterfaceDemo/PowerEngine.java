package com.oops.InterfaceDemo;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("PowerEngine Started");
    }

    @Override
    public void stop() {
        System.out.println("PowerEngine Stopped");
    }

    @Override
    public void acc() {
        System.out.println("PowerEngine Accelerated");
    }
}

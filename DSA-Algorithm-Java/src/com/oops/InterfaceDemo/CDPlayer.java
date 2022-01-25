package com.oops.InterfaceDemo;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("Media Player Start");
    }

    @Override
    public void stop() {
        System.out.println("Media Player Stop");
    }
}

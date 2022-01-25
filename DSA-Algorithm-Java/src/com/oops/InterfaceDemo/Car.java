package com.oops.InterfaceDemo;

public class Car implements Brake {
    private Engine engine ;
    private Media player = new CDPlayer();

    public Car(){
        engine = new PowerEngine();
    }

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }


    public void stop() {
        engine.stop();
    }


    public void mediaStart() {
        player.start();
    }

    public void mediaStop() {
        player.stop();
    }

    public void UpdateEngine(Engine engine) {
        this.engine = engine;
    }


    public void acc(){
        engine.acc();
    }


    @Override
    public void brake() {
        System.out.println("Brake");
    }


}


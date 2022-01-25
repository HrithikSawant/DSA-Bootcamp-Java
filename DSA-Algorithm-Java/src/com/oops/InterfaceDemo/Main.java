package com.oops.InterfaceDemo;

public class Main {

    public static void main(String[] args) {
        PowerEngine powerEngine = new PowerEngine();
        ElectricEngine electricEngine = new ElectricEngine();

        Car maruti = new Car();
        maruti.start();
        maruti.acc();
        maruti.brake();
        maruti.stop();
        maruti.UpdateEngine(electricEngine);
        maruti.start();
        maruti.acc();
        maruti.brake();
        maruti.stop();
        maruti.mediaStart();
        maruti.mediaStop();
    }
}

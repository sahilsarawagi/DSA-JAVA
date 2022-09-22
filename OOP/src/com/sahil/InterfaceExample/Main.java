package com.sahil.InterfaceExample;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Media engineCar = new Car();
        car.start();
        engineCar.start();

        PowerEngine engine = new PowerEngine();
        NewCar newcar = new NewCar(engine);
        newcar.start();
        newcar.stop();
        newcar.upgrade();
        newcar.start();
        newcar.stop();

    }

}

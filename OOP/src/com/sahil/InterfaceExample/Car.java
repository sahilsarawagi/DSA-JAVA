package com.sahil.InterfaceExample;

public class Car implements Engine,Media,Brake {
    @Override
    public void start() {
        System.out.println("Engine is started");
    }

    @Override
    public void stop() {
        System.out.println("Engine is stopped");
    }
}

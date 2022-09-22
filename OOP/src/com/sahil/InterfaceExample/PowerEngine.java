package com.sahil.InterfaceExample;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("PowerEngine has been started");
    }

    @Override
    public void stop() {
        System.out.println("PowerEngine has been stopped");
    }
}

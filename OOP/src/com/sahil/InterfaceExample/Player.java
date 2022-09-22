package com.sahil.InterfaceExample;

public class Player implements Media {

    @Override
    public void start() {
        System.out.println("Media player start");
    }

    @Override
    public void stop() {
        System.out.println("Media player stop");
    }
}

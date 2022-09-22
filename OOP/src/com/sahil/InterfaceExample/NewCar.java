package com.sahil.InterfaceExample;

public class NewCar {
    private Engine engine;
    private  Media music = new Player();

    public NewCar(Engine engine) {
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void startMusic(){
        music.start();
    }
    public void stopMusic(){
        music.stop();
    }
    public void upgrade(){
        this.engine = new ElectricEngine() ;
    }
}

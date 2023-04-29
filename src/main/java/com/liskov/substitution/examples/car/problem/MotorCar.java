package com.liskov.substitution.examples.car.problem;

public class MotorCar implements Car{

    private final Engine engine;

    public MotorCar(Engine engine){
        this.engine = engine;
    }
    @Override
    public void startEngine() {
        engine.turnOn();
    }

    @Override
    public void accelerate() {
        //Code to accelerate
    }

    @Override
    public void stopEngine() {
        engine.turnOff();
    }
}

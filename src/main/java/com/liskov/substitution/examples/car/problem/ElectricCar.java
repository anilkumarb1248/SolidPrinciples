package com.liskov.substitution.examples.car.problem;

public class ElectricCar implements Car{
    @Override
    public void startEngine() {
        throw new RuntimeException("I don't have engine");
    }

    @Override
    public void accelerate() {

    }

    @Override
    public void stopEngine() {
        throw new RuntimeException("I don't have engine");
    }
}

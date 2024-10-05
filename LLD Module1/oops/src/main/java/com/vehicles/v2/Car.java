package com.vehicles.v2;

public class Car extends Vehicle{

    CarType carType;

    Car(String model, Integer mileage,CarType type){
        super(model, mileage);
        this.carType=type;
    }

    @Override
    void start() {

    }

    @Override
    void stop() {

    }

    @Override
    void accelerate() {

    }

    @Override
    void brake() {

    }
}

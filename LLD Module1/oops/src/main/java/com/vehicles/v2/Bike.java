package com.vehicles.v2;

public class Bike extends Vehicle{
    BikeType type;

    Bike(String model,Integer mileage, BikeType type){
        super(model, mileage);
        this.type=type;
    }
    @Override
    void start() {
        System.out.println("Bike started");

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

package com.vehicles.v1;


public class Bike extends Vehicle implements VehicleIn{
    BikeType bikeType;

    Bike(String model, Integer mileage, BikeType type){
        super(model,mileage);
        this.bikeType=type;
    }


    @Override
    public void start() {
        System.out.println("Bike started");

    }

    @Override
    public void stop() {

    }

    @Override
    public void accelerate() {

    }

    @Override
    public void brake() {

    }

    @Override
    public void go() {
        // THis method is overridden by Interface default Implementation
        start();
        accelerate();
        stop();
    }
}

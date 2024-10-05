package com.vehicles.v2;

public abstract class Vehicle {
    String model;
    Integer mileage;
    public Vehicle(String model,Integer mileage){
        this.model=model;
        this.mileage=mileage;
    }
    abstract void start();
    abstract void stop();
    abstract void accelerate();

    abstract void brake();
    void go(){
        // default method common to all child class, can override if need to change the implemnetation
        start();
        accelerate();
        brake();
        stop();
    }
}

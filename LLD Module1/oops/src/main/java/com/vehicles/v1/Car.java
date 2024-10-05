package com.vehicles.v1;



public class Car extends Vehicle implements VehicleIn {
    CarType carType;

    Car(String model, Integer mileage, CarType type){
        super(model,mileage);
        this.carType=type;
    }


    @Override
    public void start() {

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

//    @Override
//    public void go() {
//        start();
//        accelerate();
//        brake();
//        stop();
//    }
}

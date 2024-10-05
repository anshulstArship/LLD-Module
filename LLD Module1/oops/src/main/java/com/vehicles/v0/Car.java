package com.vehicles.v0;


public class Car extends Vehicle {
    CarType carType;

    Car(String model,Integer mileage, CarType type){
        super(model,mileage);
        this.carType=type;
    }


}

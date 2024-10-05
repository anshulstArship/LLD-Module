package com.vehicles.v0;

import com.vehicles.v1.VehicleIn;

public class Bike extends Vehicle {
    BikeType bikeType;

    Bike(String model,Integer mileage, BikeType type){
        super(model,mileage);
        this.bikeType=type;
    }


}

package com.vehicles.v1;



public class VehicleTest {
    public static void main(String[] args) {
        VehicleIn bike = new Bike("Ducati Monster",5, BikeType.SPORTS);
        bike.start();
    }
}

package com.vehicles.v2;



public class VehicleTest {
    public static void main(String[] args) {
        Vehicle bike = new Bike("Ducati Monster",5, BikeType.SPORTS);
        bike.start();
        bike.go();
    }
}

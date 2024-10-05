package com.vehicles.v0;

public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car("HondaCity",20,CarType.SEDAN);
        System.out.println(car.model);

        Bike bike = new Bike("Ducati Monster",5,BikeType.SPORTS);
        System.out.println(bike.model);
    }
}

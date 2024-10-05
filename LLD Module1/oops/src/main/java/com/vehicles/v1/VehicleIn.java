package com.vehicles.v1;

public interface VehicleIn {
    void start();
    void stop();
    void accelerate();

    void brake();
    default void go(){
        // if we have common implementation in all subclasses
        start();
        accelerate();
        brake();
        stop();
    }
}

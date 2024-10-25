package com.bird;


public class Eagle extends Bird{
    public Eagle(String name, Double weight, BirdType type, Color color, Size size) {
        super(name, weight, type, color, size);
    }

    @Override
    public void fly() {

        System.out.println("Eagle is flying");
    }
}

package com.bird;

public class Sparrow extends Bird{
    public Sparrow(String name, Double weight, BirdType type, Color color, Size size) {
        super(name, weight, type, color, size);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying");

    }
}

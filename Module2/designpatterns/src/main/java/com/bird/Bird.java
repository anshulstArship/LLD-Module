package com.bird;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Bird {
    private String name;
    private Double weight;
    private BirdType type;
    private Color color;
    private Size size;

    public abstract void fly();

    public void eat(){

    }
    public void sleep(){
        
    }
}

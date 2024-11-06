package com.creational.abstractfactory;

import lombok.AllArgsConstructor;


public class LightButton extends Button{
    private double radius;
    private double border;

    public LightButton(double radius,double border){
        super(border);
        this.radius=radius;

    }
    @Override
    void onClick() {

    }

    @Override
    void rendered() {

    }
}

package com.creational.abstractfactory;

public class DarkButton extends Button{
    Double length;
    public DarkButton(double border,double length) {
        super(border);
        this.length=length;
    }

    @Override
    void onClick() {

    }

    @Override
    void rendered() {

    }
}

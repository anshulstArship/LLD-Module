package com.creational.abstractfactory;

public class LightThemeFactory implements ThemeFactory{
    @Override
    public Button createButton(Double border, Double length, Double radius) {
        return new LightButton(radius,border);
    }

    @Override
    public Radio createRadio() {
        return new LightRadio();
    }
}

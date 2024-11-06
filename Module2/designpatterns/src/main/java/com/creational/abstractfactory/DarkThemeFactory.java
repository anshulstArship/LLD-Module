package com.creational.abstractfactory;

public class DarkThemeFactory implements ThemeFactory{
    @Override
    public Button createButton(Double border, Double length, Double radius) {
        return new DarkButton(border,length);
    }

    @Override
    public Radio createRadio() {
        return new DarkRadio();
    }
}

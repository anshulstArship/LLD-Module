package com.creational.abstractfactory;

// Step 3 - Create Factory Interface
public interface ThemeFactory {
    Button createButton(Double border,Double lengt, Double radius);
    Radio createRadio();
}

package com.creational.abstractfactory;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Button {
    private double border;
    abstract void onClick();
    abstract void rendered();

}

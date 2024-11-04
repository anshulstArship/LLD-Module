package com.creational.simplefactory;

import lombok.AllArgsConstructor;

// Step 1 - Create a common product Interface
@AllArgsConstructor
public abstract class Button {
    private double border;
    abstract void onClick();
    abstract void rendered();
}

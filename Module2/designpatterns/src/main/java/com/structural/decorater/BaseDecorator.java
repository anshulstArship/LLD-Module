package com.structural.decorater;

import lombok.AllArgsConstructor;

// Step 3 - Base Decorator - to have a common contract between all decorators
@AllArgsConstructor
public abstract class BaseDecorator implements DataSource{
    // Why abstract class - we need reference variable as well

    protected DataSource nextLayer;
}

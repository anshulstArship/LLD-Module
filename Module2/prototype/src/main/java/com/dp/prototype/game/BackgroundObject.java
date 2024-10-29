package com.dp.prototype.game;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

// Step 2 - Implement Cloneable Interface
@NoArgsConstructor
@Setter
@Getter
public class BackgroundObject implements GraphicalObject {
    private Double x;
    private Double y;
    private Double width;
    private Double height;
    private BackgroundType type;
    @Setter(AccessLevel.NONE) // Do not create a setter
    private List<Double> pixels = new ArrayList<>();


    public BackgroundObject(Double x, Double y, BackgroundType type,Double width, Double height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        this.type=type;
        this.pixels = generatePixels(); // Time taking
    }

    public BackgroundObject(BackgroundObject reference) {
        this.x=reference.x;
        this.y=reference.y;
        this.width=reference.width;
        this.height=reference.height;
        this.pixels = reference.pixels;
        this.type=reference.type;
    }

    private List<Double> generatePixels() {
        return new ArrayList<>();
    }

    @Override
    public BackgroundObject cloneObject() {
        return new BackgroundObject(this);
    }
}

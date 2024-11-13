package com.structural.flyweight;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FlyingBullet {
    private Double x,y,z;
    private Double direction;

    // Has a relation
    private Bullet bullet;
}

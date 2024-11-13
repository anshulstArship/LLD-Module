package com.structural.flyweight;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Bullet {

    private String image;
    private Double radius;
    private Double weight;
    private BulletType type;
}

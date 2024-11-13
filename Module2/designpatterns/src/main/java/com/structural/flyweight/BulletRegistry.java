package com.structural.flyweight;

import java.util.HashMap;

public class BulletRegistry {
    private HashMap<BulletType,Bullet> map = new HashMap<>();
    public void addBullet(Bullet bullet){
        map.put(bullet.getType(),bullet);

    }
    public Bullet getBullet(BulletType name){
        return map.get(name);

    }
}

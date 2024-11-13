package com.structural;

import com.structural.flyweight.Bullet;
import com.structural.flyweight.BulletRegistry;
import com.structural.flyweight.BulletType;
import com.structural.flyweight.FlyingBullet;

public class BulletTest {


    public void testBullet(){
        BulletRegistry registry = new BulletRegistry();
        Bullet bullet1 = new Bullet("Image",2.0,10.0, BulletType.ELEVEN_MM);
        registry.addBullet(bullet1);
        FlyingBullet flyingBullet = new FlyingBullet(0.5,0.5,0.5,1.0,registry.getBullet(BulletType.ELEVEN_MM));


    }
}

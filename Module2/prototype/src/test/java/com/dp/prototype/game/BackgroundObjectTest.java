package com.dp.prototype.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BackgroundObjectTest {


    // Step 3 - Create a prototype
    @Test
    public void testClone(){
        BackgroundObject prototype = new BackgroundObject(0.0,0.0,BackgroundType.TREE,10.0,10.0);
        BackgroundObject clone = prototype.cloneObject();
        assertEquals(prototype.getX(),clone.getY(),"Objects are same");

    }

    @Test
    public void testRegistry(){
        BackgroundObject prototype = new BackgroundObject(0.0,0.0,BackgroundType.TREE,10.0,10.0);
        BackgroundObjectRegistry registry = new BackgroundObjectRegistry();
        registry.addPrototype(prototype);
        BackgroundObject obj = registry.getPrototype(prototype.getType());
        assertNotNull(obj,"Able to fetch Object");
    }
}

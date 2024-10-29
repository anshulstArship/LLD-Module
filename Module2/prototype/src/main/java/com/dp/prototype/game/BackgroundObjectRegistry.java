package com.dp.prototype.game;

import java.util.HashMap;
import java.util.Map;

public class BackgroundObjectRegistry {

    private Map<BackgroundType,BackgroundObject> map = new HashMap<>();
    public void addPrototype(BackgroundObject object){
        map.put(object.getType(),object);

    }
    public void removePrototype(BackgroundType type){
        map.remove(type);

    }
    public BackgroundObject getPrototype(BackgroundType type){
        return map.get(type);
    }
}

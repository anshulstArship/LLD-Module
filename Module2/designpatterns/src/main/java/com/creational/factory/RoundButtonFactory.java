package com.creational.factory;

public class RoundButtonFactory implements ButtonFactory{


    @Override
    public Button createButton(Double border, Double radius, Double length) {
        return new RoundBtn(border,radius);
    }
}

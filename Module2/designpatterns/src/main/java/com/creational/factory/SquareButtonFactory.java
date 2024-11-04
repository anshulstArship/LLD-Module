package com.creational.factory;

public class SquareButtonFactory implements ButtonFactory{


    @Override
    public Button createButton(Double border, Double radius, Double length) {
        return new SquareBtn(border,length);
    }
}

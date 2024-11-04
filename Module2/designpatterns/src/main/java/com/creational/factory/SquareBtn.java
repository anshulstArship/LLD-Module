package com.creational.factory;

import lombok.AllArgsConstructor;


public class SquareBtn extends Button{
    private double length;
    private double border;

    public SquareBtn(double border,double length) {
        super(border);
        this.length=length;
    }

    void onClick(){
        System.out.println("Square Button was clicked");
    }
    void rendered(){
        System.out.println("Rendered");
    }
}

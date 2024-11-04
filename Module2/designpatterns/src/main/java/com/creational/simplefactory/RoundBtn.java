package com.creational.simplefactory;

// Step 2 - Create Concrete Class
public class RoundBtn extends Button{
    private double radius;
    private double border;

    public RoundBtn(double border,double radius) {
        super(border);
        this.radius=radius;
    }

    void onClick(){
        System.out.println("Round Button was clicked");
    }
    void rendered(){
        System.out.println("Rendered");
    }
}

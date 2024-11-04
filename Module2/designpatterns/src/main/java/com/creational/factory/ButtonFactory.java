package com.creational.factory;

public class ButtonFactory {
    // Step 3 - Create a static Factory Method

    public static Button createButton(ScreenSize size,Double border, Double radius, Double length){
        switch (size){
            case TABLET:
            case MOBILE : return new RoundBtn(border,radius);
            case LAPTOP: return new SquareBtn(border,length);
        }
        throw new IllegalArgumentException();

    }
}

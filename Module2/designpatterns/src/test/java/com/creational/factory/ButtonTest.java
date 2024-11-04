package com.creational.factory;

import com.creational.factory.RoundBtn;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

public class ButtonTest {

    @Test
    void testRoundBtn(){

        ButtonFactory factory = new RoundButtonFactory();

        Button button = factory.createButton(10.0,10.0,null);
        Assertions.assertTrue(button instanceof RoundBtn," If screen size is tablet, button should br round");


    }
}

package com.creational.factory;



import org.junit.jupiter.api.*;


public class ButtonTest {

    @Test
    public void testRoundButton() {

        Button button = ButtonFactory.createButton(ScreenSize.TABLET, 10.0, 10.0, null);
        Assertions.assertTrue(button instanceof RoundBtn," If screen size is tablet, button should br round");
    }
}

// Why the factory pattern?
// SRP and OCP works
// No Complex construction logic
// Reduce usage of subclasses

// Downside of simple Factory Pattern
// Parameter Explosion
// Breaking SRP and OCP in library (Client code/user doesn't break this)

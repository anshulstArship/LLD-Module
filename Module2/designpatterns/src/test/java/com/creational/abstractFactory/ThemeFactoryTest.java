package com.creational.abstractFactory;

import com.creational.abstractfactory.Button;
import com.creational.abstractfactory.DarkButton;
import com.creational.abstractfactory.DarkThemeFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThemeFactoryTest {
    @Test
    public void testDarkTheme(){
        DarkThemeFactory factory = new DarkThemeFactory();
        Button button = factory.createButton(10.0,10.0,null);
        Assertions.assertTrue(button instanceof DarkButton," If Button is instance of Dark Button");
    }
}

package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void getSoundReturnMeow() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        String expected = "Мяу";

        assertEquals(expected, actual);
    }
}
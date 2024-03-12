package com.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FelineTest {
    private Feline feline;

    @Before
    public void init() {
        feline = new Feline();
    }

    @Test
    public void eatMeatIsNotEmpty() throws Exception{
        boolean actual = feline.eatMeat().isEmpty();

        assertFalse(actual);
    }

    @Test
    public void getFamilyReturnFeline() {
        String actual = feline.getFamily();
        String expected = "Кошачьи";

        assertEquals(expected, actual);
    }

    @Test
    public void getKittensReturnKittensCount() {
        int actual = feline.getKittens();

        assertTrue(actual > 0);
    }

    @Test
    public void getKittensPositiveAmountReturnKittensCount() {
        int actual = feline.getKittens(4);
        int expected = 4;

        assertEquals(expected, actual);
    }
}
package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CatParameterizedTest {
    private Cat cat;
    private String food;
    private boolean expected;

    public CatParameterizedTest(String food, boolean expected) {
        this.food = food;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object [] [] getTestData() {
        return new Object[][] {
                {"Животные", true},
                {"Птицы", true},
                {"Рыба", true},
                {"Морковь", false},
                {"Радуга", false},
        };
    }

    @Before
    public void init() {
        Feline feline = new Feline();
        cat = new Cat(feline);
    }

    @Test
    public void getFoodReturnPredator() throws Exception {
        List<String> actual = cat.getFood();

        assertEquals(expected, actual.contains(food));
    }
}
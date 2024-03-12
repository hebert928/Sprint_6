package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    private Lion lion;
    private String sex;
    private boolean expected;

    public LionParameterizedTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object [] [] getTestData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Before
    public void init() throws Exception{
        Feline feline = new Feline();
        lion = new Lion(sex, feline);
    }

    @Test
    public void doesHaveManeReturnHasMane() {
        boolean actual = lion.doesHaveMane();

        assertEquals(expected, actual);
    }
}
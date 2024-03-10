package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    private Feline feline;

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void lionCreateException() throws Exception{
        exceptionRule.expect(Exception.class);
        exceptionRule.expectMessage("Используйте допустимые значения пола животного - самец или самка");
        new Lion("Бесполый", feline);
    }

    @Test
    public void getKittensReturnKittensCount() throws Exception{
        Lion lion = new Lion("Самец", feline);
        int expected = 4;
        Mockito.when(feline.getKittens()).thenReturn(expected);
        int actual = lion.getKittens();

        assertEquals(expected, actual);
    }

    @Test
    public void getFoodReturnPredator() throws Exception{
        Lion lion = new Lion("Самка", feline);
        List<String> expected = List.of("Огурчики", "Грибочки", "Рыбов");
        Mockito.when(feline.eatMeat()).thenReturn(expected);
        List<String> actual = lion.getFood();

        assertArrayEquals(expected.toArray(new String[]{}), actual.toArray(new String[]{}));
    }
}
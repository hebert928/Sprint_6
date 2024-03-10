package com.example;

import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;
public class AlexTest {
    private Alex alex;

    @Before
    public void init() throws Exception{
        Feline feline = new Feline();
        alex = new Alex(feline);
    }

    @Test
    public void getFriendsReturnListOfNames() {
        List<String> expected = alex.getFriends();
        List<String> actual = List.of("Марти", "Глория", "Мелман");

        assertArrayEquals(expected.toArray(new String[]{}), actual.toArray(new String[]{}));
    }

    @Test
    public void getPlaceOfLivingReturnNewYorkZoo() {
        String actual = alex.getPlaceOfLiving();
        String expected = "Нью-Йоркский зоопарк";

        assertEquals(expected, actual);
    }

    @Test
    public void getKittensReturnZeroKittens() {
        int actual = alex.getKittens();

        assertTrue(actual == 0);
    }
}
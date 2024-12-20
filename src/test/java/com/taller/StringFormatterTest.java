package com.taller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringFormatterTest {

    private final StringFormatter formatter = new StringFormatter();

    @Test
    public void testFormatBaseCases() {
        String firstFormatted = formatter.format("5F3Z-2e-9-w", 4);
        assertEquals("5F3Z-2E9W", firstFormatted);

        String secondFormatted = formatter.format("2-5g-3-J", 2);
        assertEquals("2-5G-3J", secondFormatted);
    }

    @Test
    public void testFormatEmptyString() {
        assertEquals("", formatter.format("", 4));
    }

    @Test
    public void testFormatSingleCharacter() {
        String expected = "A";
        assertEquals(expected, formatter.format("A", 4));
    }

    @Test
    public void testFormatAllLowerCase() {
        String expected = "ABC-DEF-GHI";
        assertEquals(expected, formatter.format("abc-def-ghi", 3));
    }

    @Test
    public void testFormatMultipleDashes() {
        String expected = "AB-CD";
        assertEquals(expected, formatter.format("a-b--c---d", 2));
    }

    @Test
    public void testFormatAlphanumeric() {
        String expected = "A1B2-C3D4-E5F6";
        assertEquals(expected, formatter.format("a1b2-c3d4-e5f6", 4));
    }
}

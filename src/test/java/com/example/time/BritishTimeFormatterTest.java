package com.example.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BritishTimeFormatterTest {

    @Test
    void testNoon() {
        assertEquals("noon", BritishTimeFormatter.toSpokenForm(12, 0));
    }

    @Test
    void testMidnight() {
        assertEquals("midnight", BritishTimeFormatter.toSpokenForm(0, 0));
    }

    @Test
    void testQuarterPast() {
        assertEquals("quarter past three", BritishTimeFormatter.toSpokenForm(3, 15));
    }

    @Test
    void testQuarterTo() {
        assertEquals("quarter to six", BritishTimeFormatter.toSpokenForm(5, 45));
    }

    @Test
    void testTwentyFivePast() {
        assertEquals("twenty-five past six", BritishTimeFormatter.toSpokenForm(6, 25));
    }

    @Test
    void testTwentyToNine() {
        assertEquals("twenty to nine", BritishTimeFormatter.toSpokenForm(8, 40));
    }

    @Test
    void testThirtyTwoPast() {
        assertEquals("twenty-eight to seven", BritishTimeFormatter.toSpokenForm(6, 32));
    }
}

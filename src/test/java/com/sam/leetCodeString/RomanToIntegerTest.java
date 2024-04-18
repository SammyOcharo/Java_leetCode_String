package com.sam.leetCodeString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    @Test
    void romanToInt() {
        assertEquals(3, RomanToInteger.romanToInt("III"));
        assertEquals(1994, RomanToInteger.romanToInt("MCMXCIV"));
        assertEquals(888, RomanToInteger.romanToInt("DCCCLXXXVIII"));
        assertNotEquals(1993, RomanToInteger.romanToInt("MCMXCIV"));
    }
}
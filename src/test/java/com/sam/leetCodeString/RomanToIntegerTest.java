package com.sam.leetCodeString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    @Test
    void romanToInt() {
        assertEquals(3, RomanToInteger.romanToInt("III"));
        assertEquals(1994, RomanToInteger.romanToInt("MCMXCIV"));
    }
}
package com.sam.leetCodeString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubWordOccurrenceInStringTest {

    @Test
    void strStr() {
        assertEquals(0, SubWordOccurrenceInString.strStr("sadbutsad", "sad"));
        assertEquals(-1, SubWordOccurrenceInString.strStr("leetcode", "leeto"));
        assertNotEquals(-1, SubWordOccurrenceInString.strStr("sadbutsad", "sad"));
    }
}
package com.sam.leetCodeString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringArraysEquivalentTest {

    @Test
    void arrayStringsAreEqual() {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        assertTrue(StringArraysEquivalent.arrayStringsAreEqual(word1, word2));
    }
}
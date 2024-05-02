package com.sam.leetCodeString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringArraysEquivalentTest {

    @Test
    void arrayStringsAreEqual() {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        String[] word3 = {"abc", "d", "defg"};
        String[] word4 = {"abcddefg"};

        String[] word5 = {"a", "cb"};
        String[] word6 = {"ab", "c"};

        assertTrue(StringArraysEquivalent.arrayStringsAreEqual(word1, word2));
        assertTrue(StringArraysEquivalent.arrayStringsAreEqual(word3, word4));
        assertFalse(StringArraysEquivalent.arrayStringsAreEqual(word5, word6));
    }
}
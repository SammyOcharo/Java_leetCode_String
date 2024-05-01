package com.sam.leetCodeString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversePrefixOfWordTest {

    @Test
    void reversePrefix() {
        assertEquals("dcbaefd", ReversePrefixOfWord.reversePrefix("abcdefd", 'd'));
        assertEquals("dcbaefd", ReversePrefixOfWord.reversePrefix("abcdefd", 'd'));
    }
}
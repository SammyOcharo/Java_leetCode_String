package com.sam.leetCodeString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TruncateSentenceTest {

    @Test
    void truncateSentence() {
        assertEquals("Hello how are you", TruncateSentence.truncateSentence("Hello how are you Contestant",4));
        assertEquals("What is the solution", TruncateSentence.truncateSentence("What is the solution to this problem", 4));
        assertEquals("chopper is not a tanuki", TruncateSentence.truncateSentence("chopper is not a tanuki", 5));
        assertNotEquals("chopper is not tanuki", TruncateSentence.truncateSentence("chopper is not a tanuki", 5));
    }
}
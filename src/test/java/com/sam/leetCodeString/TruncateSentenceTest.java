package com.sam.leetCodeString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TruncateSentenceTest {

    @Test
    void truncateSentence() {
        assertEquals("Hello how are you", TruncateSentence.truncateSentence("Hello how are you Contestant",4));
    }
}
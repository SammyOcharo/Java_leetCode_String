package com.sam.leetCodeString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringScoreTest {

    @Test
    void scoreOfString() {
        assertEquals(13, StringScore.scoreOfString("hello"));
        assertEquals(50, StringScore.scoreOfString("zaz"));
    }
}
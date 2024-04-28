package com.sam.leetCodeString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JewelsandStonesTest {

    @Test
    void numJewelsInStones() {
        assertEquals(3, JewelsandStones.numJewelsInStones("aA", "aAAbbbb"));
    }
}
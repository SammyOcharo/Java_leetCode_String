package com.sam.leetCodeString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JewelsandStonesTest {

    @Test
    void numJewelsInStones() {
        assertEquals(3, JewelsandStones.numJewelsInStones("aA", "aAAbbbb"));
        assertEquals(0, JewelsandStones.numJewelsInStones("z", "ZZ"));
        assertNotEquals(1, JewelsandStones.numJewelsInStones("z", "ZZ"));
        assertEquals(0, JewelsandStones.numJewelsInStones("", ""));
    }
}
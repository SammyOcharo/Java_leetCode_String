package com.sam.leetCodeString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharacterStringTest {

    @Test
    void firstUniqChar() {
        assertEquals(0, FirstUniqueCharacterString.firstUniqChar("sammy"));
        assertEquals(0, FirstUniqueCharacterString.firstUniqChar("leetcode"));
        assertEquals(2, FirstUniqueCharacterString.firstUniqChar("loveleetcode"));
        assertEquals(-1, FirstUniqueCharacterString.firstUniqChar("aabb"));
    }
}
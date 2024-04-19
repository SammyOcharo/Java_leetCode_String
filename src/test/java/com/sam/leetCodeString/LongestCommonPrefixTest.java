package com.sam.leetCodeString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    void longestCommonPrefix() {

        String[] strs = {"flower","flow","flight"};

        assertEquals("fl", LongestCommonPrefix.longestCommonPrefix(strs));
    }
}
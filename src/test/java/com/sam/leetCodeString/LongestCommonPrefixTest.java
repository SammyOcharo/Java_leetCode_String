package com.sam.leetCodeString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    void longestCommonPrefix() {

        String[] strs = {"flower","flow","flight"};
        String[] strs1 = {"dog","racecar","car"};
        String[] strs3 = {"steve","stevy","stevy"};

        assertEquals("fl", LongestCommonPrefix.longestCommonPrefix(strs));
        assertEquals("", LongestCommonPrefix.longestCommonPrefix(strs1));
        assertNotEquals("ds", LongestCommonPrefix.longestCommonPrefix(strs1));
        assertEquals("stev", LongestCommonPrefix.longestCommonPrefix(strs3));
    }
}
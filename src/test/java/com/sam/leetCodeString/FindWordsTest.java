package com.sam.leetCodeString;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FindWordsTest {

    @Test
    void findWordsContaining() {
        String[] words = {"leet","code"};
        String x = "e";

        int[] arr = {0,1};

        assertEquals(Arrays.toString(arr), Arrays.toString(FindWords.findWordsContaining(words, x)));
    }
}
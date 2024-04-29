package com.sam.leetCodeString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumNumberOfWordsFoundInSentencesTest {

    @Test
    void mostWordsFound() {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        String[] sentences1 = {"please wait", "continue to fight", "continue to win"};
        assertEquals(6, MaximumNumberOfWordsFoundInSentences.mostWordsFound(sentences));
        assertEquals(3, MaximumNumberOfWordsFoundInSentences.mostWordsFound(sentences1));
    }
}
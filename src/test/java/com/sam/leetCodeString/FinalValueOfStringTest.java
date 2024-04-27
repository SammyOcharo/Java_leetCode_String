package com.sam.leetCodeString;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FinalValueOfStringTest {

    @Test
    void finalValueAfterOperations() {
        String[] arr = {"--X","X++","X++"};
        assertEquals(1, FinalValueOfString.finalValueAfterOperations(arr));
    }
}
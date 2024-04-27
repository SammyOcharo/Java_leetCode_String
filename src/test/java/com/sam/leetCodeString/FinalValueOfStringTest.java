package com.sam.leetCodeString;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FinalValueOfStringTest {

    @Test
    void finalValueAfterOperations() {
        String[] arr = {"--X","X++","X++"};
        String[] arr1 = {"X++","++X","--X","X--"};
        assertEquals(1, FinalValueOfString.finalValueAfterOperations(arr));
        assertEquals(0, FinalValueOfString.finalValueAfterOperations(arr1));
        assertNotEquals(0, FinalValueOfString.finalValueAfterOperations(arr));
    }
}
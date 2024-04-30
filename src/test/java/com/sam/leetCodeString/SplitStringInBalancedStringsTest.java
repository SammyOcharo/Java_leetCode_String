package com.sam.leetCodeString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SplitStringInBalancedStringsTest {

    @Test
    void balancedStringSplit() {
        assertEquals(4, SplitStringInBalancedStrings.balancedStringSplit("RLRRLLRLRL"));
    }
}
package com.sam.leetCodeString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SplitStringInBalancedStringsTest {

    @Test
    void balancedStringSplit() {
        assertEquals(4, SplitStringInBalancedStrings.balancedStringSplit("RLRRLLRLRL"));
        assertEquals(2, SplitStringInBalancedStrings.balancedStringSplit("RLRRRLLRLL"));
        assertEquals(1, SplitStringInBalancedStrings.balancedStringSplit("LLLLRRRR"));
        assertNotEquals(2, SplitStringInBalancedStrings.balancedStringSplit("LLLLRRRR"));
    }
}
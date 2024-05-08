package com.sam.leetCodeString;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CountItemsMatchingRuleTest {

    @Test
    void countMatches() {
        List<List<String>> items1 = List.of(
                List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "lenovo"),
                List.of("phone", "gold", "iphone")
        );

        assertEquals(1, CountItemsMatchingRule.countMatches(items1, "color", "silver"));

        List<List<String>> items2 = List.of(
                List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "phone"),
                List.of("phone", "gold", "iphone")
        );

        assertEquals(2, CountItemsMatchingRule.countMatches(items2, "type", "phone"));
    }
}
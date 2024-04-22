package com.sam.leetCodeString;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LetterCombinationOfPhoneTest {

    @Test
    void letterCombinations() {
        List<String> arr = List.of("ad","ae","af","bd","be","bf","cd","ce","cf");
        List<String> arr1 = List.of("a","b","c");
        List<String> arr2 = List.of("");
        assertEquals(arr, LetterCombinationOfPhone.letterCombinations("23"));
        assertEquals(arr1, LetterCombinationOfPhone.letterCombinations("2"));
        assertEquals(arr2, LetterCombinationOfPhone.letterCombinations(""));
    }
}
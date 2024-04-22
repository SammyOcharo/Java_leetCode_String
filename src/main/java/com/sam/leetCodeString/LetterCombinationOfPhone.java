package com.sam.leetCodeString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationOfPhone {
    //Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
    //
    //A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

    //
    //Example 1:
    //
    //Input: digits = "23"
    //Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
    //Example 2:
    //
    //Input: digits = ""
    //Output: []
    //Example 3:
    //
    //Input: digits = "2"
    //Output: ["a","b","c"]
    //
    //
    //Constraints:

    public static List<String> letterCombinations(String digits){
        List<String> result = new ArrayList<>();
        System.out.println("This is the digits " + digits);
        if(digits == null || digits.isEmpty()){
            result.add("");
            return result;
        }

        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        backtrack(result,  map, digits,0, new StringBuilder());
        return result;

    }

    private static void  backtrack(List<String> result, Map<Character, String> map, String digits, int index, StringBuilder current){
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        char digit = digits.charAt(index);
        String letters = map.get(digit);

        for (int i = 0; i < letters.length(); i++) {
            current.append(letters.charAt(i));
            backtrack(result, map, digits, index + 1, current);
            current.deleteCharAt(current.length() - 1);
        }


    }

}

package com.sam.leetCodeString;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterString {
    //Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

    //Example 1:
    //
    //Input: s = "leetcode"
    //Output: 0
    //Example 2:
    //
    //Input: s = "loveleetcode"
    //Output: 2
    //Example 3:
    //
    //Input: s = "aabb"
    //Output: -1

    public static int firstUniqChar(String word){
        Map<Character, Integer> entries = new LinkedHashMap<>();

        for(char c: word.toCharArray()){
            entries.put(c,entries.getOrDefault(c, 0) + 1);
        }
        System.out.println(entries);

        for(int i=0; i<word.length(); i++){
            if(entries.get(word.charAt(i)) == 1){
                return i;
            }
        }

        return -1;

    }

}

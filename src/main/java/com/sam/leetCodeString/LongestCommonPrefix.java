package com.sam.leetCodeString;

public class LongestCommonPrefix {

    //Write a function to find the longest common prefix string amongst an array of strings.
    //
    //If there is no common prefix, return an empty string "".

    //Example 1:
    //
    //Input: strs = ["flower","flow","flight"]
    //Output: "fl"
    //Example 2:
    //
    //Input: strs = ["dog","racecar","car"]
    //Output: ""
    //Explanation: There is no common prefix among the input strings.

    public static String longestCommonPrefix(String[]namesArray){

        if (namesArray == null || namesArray.length == 0) {
            return "";
        }

        StringBuilder similarStringCharacters = new StringBuilder();

        String firstWord = namesArray[0];

        for(int i=0; i < firstWord.length(); i++){
           Character wordChar = firstWord.charAt(i);

           for(String s: namesArray){
               if(i >= s.length() || s.charAt(i) != wordChar){
                   return similarStringCharacters.toString();
               }


           }
            similarStringCharacters.append(wordChar);
        }

        System.out.println(similarStringCharacters.toString());

        return similarStringCharacters.toString();
    }
}

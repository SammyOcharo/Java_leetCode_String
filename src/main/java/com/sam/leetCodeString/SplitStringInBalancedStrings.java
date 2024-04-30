package com.sam.leetCodeString;

public class SplitStringInBalancedStrings {
    //Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
    //
    //Given a balanced string s, split it into some number of substrings such that:
    //
    //Each substring is balanced.
    //Return the maximum number of balanced strings you can obtain.

    //Example 1:
    //
    //Input: s = "RLRRLLRLRL"
    //Output: 4
    //Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
    //Example 2:
    //
    //Input: s = "RLRRRLLRLL"
    //Output: 2
    //Explanation: s can be split into "RL", "RRRLLRLL", each substring contains same number of 'L' and 'R'.
    //Note that s cannot be split into "RL", "RR", "RL", "LR", "LL", because the 2nd and 5th substrings are not balanced.
    //Example 3:
    //
    //Input: s = "LLLLRRRR"
    //Output: 1
    //Explanation: s can be split into "LLLLRRRR".

    public static int balancedStringSplit(String s){
        int totalL = 0;
        int totalR = 0;
        int balancedCount=0;

        for(char c: s.toCharArray()){
            if(c == 'L'){
                totalL += 1;
            }else{
                totalR += 1;
            }

            if (totalL == totalR) {
                balancedCount++;
                // Reset counts for the next substring
                totalL = 0;
                totalR = 0;
            }
        }
        return balancedCount;

    }
}

package com.sam.leetCodeString;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    //Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
    //
    //
    //
    //Example 1:
    //
    //Input: n = 3
    //Output: ["((()))","(()())","(())()","()(())","()()()"]
    //Example 2:
    //
    //Input: n = 1
    //Output: ["()"]

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(result, new StringBuilder(), n, n);
        return result;
    }

    private static void generate(List<String> result, StringBuilder current, int left, int right) {
        if (left == 0 && right == 0) {
            System.out.println(current);
            result.add(current.toString());
            return;
        }
        if (left > 0) {
            generate(result, new StringBuilder(current).append("("), left - 1, right);

        }
        if (right > left) {
            generate(result, new StringBuilder(current).append(")"), left, right - 1);

        }
    }

    public static void main(String[] args) {
        int n1 = 2;
        System.out.println("Input: n = " + n1);
        System.out.println("Output: " + generateParenthesis(n1));

        int n2 = 1;
        System.out.println("Input: n = " + n2);
        System.out.println("Output: " + generateParenthesis(n2));
    }
}

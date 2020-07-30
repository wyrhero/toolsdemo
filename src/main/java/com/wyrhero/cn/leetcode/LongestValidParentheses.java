package com.wyrhero.cn.leetcode;

//给定一个只包含 '(' 和 ')' 的字符串，找出最长的包含有效括号的子串的长度。
//
// 示例 1:
//
// 输入: "(()"
//输出: 2
//解释: 最长有效括号子串为 "()"
//
//
// 示例 2:
//
// 输入: ")()())"
//输出: 4
//解释: 最长有效括号子串为 "()()"
//
// Related Topics 字符串 动态规划

public class LongestValidParentheses {
    public static int longestValidParentheses(String s) {
        char[] chars = s.toCharArray();
        final int length = chars.length;
        int[][] statusArray = new int[length][length];

        for(int k = 0; k < length; k++) {
            for(int i = 0; i < length - k; i++) {
                int j = i + k;


            }
        }




        return 1;

    }

    public static void main(String[] args) {

    }
}

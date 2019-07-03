package com.wyrhero.cn.leetcode;


//编写一个函数来查找字符串数组中的最长公共前缀。
//
// 如果不存在公共前缀，返回空字符串 ""。
//
// 示例 1:
//
// 输入: ["flower","flow","flight"]
//输出: "fl"
//
//
// 示例 2:
//
// 输入: ["dog","racecar","car"]
//输出: ""
//解释: 输入不存在公共前缀。
//
//
// 说明:
//
// 所有输入只包含小写字母 a-z 。
//
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if(0 == strs.length) {
            return "";
        }
        int minLength = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            if(strs[i].length() < minLength) {
                minLength = strs[i].length();
            }
        }
        int result = 0;
        boolean forFlag = true;
        for (int i = 0; i < minLength; i++) {
            if(!forFlag) {
                break;
            }
            char waitingMatchChar = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if(!forFlag) {
                    break;
                }
               if (waitingMatchChar != strs[j].charAt(i)){
                   forFlag = false;
                   break;
               }
               if(j == strs.length - 1) {
                   result++;
               }
            }

        }

        String resultString = strs[0].substring(0,result);

        return resultString;

    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}

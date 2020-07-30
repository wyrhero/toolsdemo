package com.wyrhero.cn.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidParentheses {

    public static boolean test(String s) {
        final Map<String,String> symbolMap = new HashMap<String,String>();
        symbolMap.put("(",")");
        symbolMap.put("[","]");
        symbolMap.put("{","}");

        List<String> stack = new ArrayList(2);

        String stackTopSymbol = "";
        for(int i = 0; i < s.length(); i++) {
            String currentSymbol = String.valueOf(s.charAt(i));
            boolean isLeftSymbol = (symbolMap.get(currentSymbol) != null);
            if(isLeftSymbol) {
                //当前字符是左边的符号，入栈
                stackTopSymbol = currentSymbol;
                stack.add(stackTopSymbol);
            } else {
                //当前字符是右边的符号，匹配栈顶的字符
                if(stack.size() > 0) {
                    String key = stack.get(stack.size() - 1);
                    if(symbolMap.get(key).equals(currentSymbol)) {
                        stack.remove(stack.size() - 1);
                    } else {
                        return false;
                    }
                    if(stack.size() > 0) {
                        stackTopSymbol = stack.get(stack.size() - 1);
                    } else {
                        stackTopSymbol = "";
                    }

                } else {
                    //栈顶无元素 就出现了右边字符，直接返回校验失败
                    return false;
                }

            }
        }

        return stack.size() == 0;

    }

    public static void main(String[] args) {
        /*System.out.println(test("()"));
        System.out.println(test("()[]{}"));
        System.out.println(test("(]"));
        System.out.println(test("([)]"));
        System.out.println(test("{[]}"));*/
        System.out.println(test("(])"));

    }
}

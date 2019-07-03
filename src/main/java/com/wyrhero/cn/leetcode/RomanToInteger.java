package com.wyrhero.cn.leetcode;

//罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
//
// 字符          数值
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000
//
// 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做 XXVII, 即为 XX + V + II 。
//
// 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
//
//
// I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
// X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
// C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
//
//
// 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
//
// 示例 1:
//
// 输入: "III"
//输出: 3
//
// 示例 2:
//
// 输入: "IV"
//输出: 4
//
// 示例 3:
//
// 输入: "IX"
//输出: 9
//
// 示例 4:
//
// 输入: "LVIII"
//输出: 58
//解释: L = 50, V= 5, III = 3.
//
//
// 示例 5:
//
// 输入: "MCMXCIV"
//输出: 1994
//解释: M = 1000, CM = 900, XC = 90, IV = 4.
//

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int romanToInt(String s) {
        Map<String,Integer> letterMap = new HashMap(7);
        Map<String,Integer> specialLetterMap = new HashMap(6);

        // I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
        // X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
        // C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
        specialLetterMap.put("IV",4);
        specialLetterMap.put("IX",9);
        specialLetterMap.put("XL",40);
        specialLetterMap.put("XC",90);
        specialLetterMap.put("CD",400);
        specialLetterMap.put("CM",900);

        // 字符          数值
        //I             1
        //V             5
        //X             10
        //L             50
        //C             100
        //D             500
        //M             1000
        letterMap.put("I",1);
        letterMap.put("V",5);
        letterMap.put("X",10);
        letterMap.put("L",50);
        letterMap.put("C",100);
        letterMap.put("D",500);
        letterMap.put("M",1000);

        int result = 0;

        for (String key : specialLetterMap.keySet()) {
            Integer value = specialLetterMap.get(key);
            int pos = s.indexOf(key);
            while (pos > -1) {
                result += value;
                s = s.replace(key,"");
                pos = s.indexOf(key);
            }
        }

        if(null != s && !s.isEmpty()) {
            char[] chars = s.toCharArray();
            for (char subChar : chars) {
                result += letterMap.get(String.valueOf(subChar));
            }
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));

    }
}

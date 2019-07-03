package com.wyrhero.cn.leetcode;

/*
给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

 示例 1:

 输入: 123
输出: 321


 示例 2:

 输入: -123
输出: -321


 示例 3:

 输入: 120
输出: 21


 注意:

 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231, 231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
*/

public class ReverseInteger {
    public int reverse(int x) {
        if(0 == x) {
            return 0;
        }
        int a = 0,b = 0;
        int result = 0;
        long temp = 0;
        while (x != 0) {
            a = x / 10;
            b = x % 10;
            temp = (long)result * 10 + b;
            if(temp < Integer.MIN_VALUE || temp > Integer.MAX_VALUE) {
                return 0;
            }
            result = (int)temp;
            x = a;
        }
        return result;

       //方法2
       /* boolean negative = false;
        long num = x;
        if(num < 0){
            negative = true;
            num = -num;
        };
        String str = String.valueOf(num);
        StringBuffer sb = new StringBuffer(str);
        StringBuffer reverse = sb.reverse();

        long result = Long.valueOf(reverse.toString());
        if(negative) {
            result *= -1;
        }

        if(result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int)result;
        }*/
    }

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverse(-0));
        System.out.println(reverseInteger.reverse(-2147483648));
        System.out.println(reverseInteger.reverse(-123));
        System.out.println(reverseInteger.reverse(-120));
    }


}

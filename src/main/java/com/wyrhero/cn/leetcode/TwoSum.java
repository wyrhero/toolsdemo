package com.wyrhero.cn.leetcode;

import java.util.*;

/**
 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。

 示例:

 给定 nums = [2, 7, 11, 15], target = 9

 因为 nums[0] + nums[1] = 2 + 7 = 9
 所以返回 [0, 1]

 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        List<Integer> subList = new ArrayList<Integer>();
        List<Integer> numsList = new ArrayList<Integer>();

        //key为对应的值  value为 出现次数
        Map<Integer,Integer> numsMap = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++) {
            Integer count = numsMap.get(nums[i]);
            if(null != count && 2 == count) {
                continue;
            }
            if(null == count) {
                numsMap.put(nums[i],1);
            } else {
                numsMap.put(nums[i],count + 1);
            }
            subList.add(i);
            numsList.add(nums[i]);
        }
        for(int i = 0; i < numsList.size() - 1; i++) {
            for (int j = i + 1; j < numsList.size(); j++) {
                if(target == numsList.get(i) + numsList.get(j)) {
                    return  new int[]{subList.get(i),subList.get(j)};
                }
            }
        }
        return null;
    }


    public static void main(String[] args) {
        //int[] ints = twoSum(new int[]{2, 7, 11, 15}, 9);
        int[] ints = twoSum(new int[]{3,2, 4}, 6);
        System.out.println(ints);
    }
}

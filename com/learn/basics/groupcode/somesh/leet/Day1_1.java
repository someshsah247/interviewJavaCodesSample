package com.learn.basics.groupcode.somesh.leet;

import java.util.Arrays;

// url -- https://leetcode.com/problems/two-sum/description/
//name -- 1. Two Sum
public class Day1_1 {

    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(target == nums[j] + nums[i]) {
                    a[0] = i;
                    a[1] = j;
                    return a;
                }
            }
        }
        return new int[2];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        int target = 7;
        Day1_1 d = new Day1_1();
        Arrays.stream(d.twoSum(arr,target)).forEach(System.out::print);
    }
}

package com.learn.basics.groupcode.leet;

// url -- https://leetcode.com/problems/largest-number-at-least-twice-of-others/description/
// name -- 747. Largest Number At Least Twice of Others

import java.util.Arrays;

public class Day2_747 {

    public int dominantIndex(int[] nums) {
        int top=0;
        int index=-1;
        int sectop=0;
        int len=nums.length;
        for(int i=0;i<len;i++){
            if(top<nums[i])
            {
                sectop = top;
                top=nums[i];
                index=i;
            }
            else if(sectop<nums[i] && top>=nums[i]) sectop=nums[i];
        }
        if((sectop*2)<=top) return index;
        else return -1;
   }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        int[] arr2 = new int[]{1,6,2};
        Day2_747 d = new Day2_747();
        System.out.println(d.dominantIndex(arr));
        System.out.println(d.dominantIndex(arr2));
    }

}

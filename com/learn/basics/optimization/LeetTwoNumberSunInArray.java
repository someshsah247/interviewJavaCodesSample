package com.learn.basics.optimization;

public class LeetTwoNumberSunInArray {

    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for(int j = 1; j < nums.length; j++) {
                if(target == nums[j] + nums[i]) {
                    a[0] = i;
                    a[1] = j;
                    return a;
                }
            }
        }
        return new int[0];
    }
        public static void main(String[] args) {
            int[] arr = new int[]{2,7,11,15};
            LeetTwoNumberSunInArray l = new LeetTwoNumberSunInArray();
            int[] a = l.twoSum(arr,9);
            System.out.println("["+a[0] +","+a[1]+"]");
        }
}

package com.learn.basics.interview;

import java.util.Arrays;

public class Testsss {

    /*
Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.
     */

    public static void main(String[] args) {
        // int array  [1,2,3,4,6]  // 0,2,1,-1,0 -- -1,1,2
        // find  // index = 3 , if -1
        int[] arr = new int[] {1,7,3,6,5,6}; //{1,2,3,4,6}; ==> 28 --  8-3-17 --- > 28 - (11 + 6)  == 11
        //Arrays.sort(arr);
//        int sum = arr[arr.length-1]; // 6
//        int sunOfElements = 0;
//        for (int i = 0, j= arr.length;  i < arr.length; i++) {
//            //int sum = arr[arr.length-1];
//            if(sum != sunOfElements){
//                sunOfElements+= arr[i];
//            }else {
//                System.out.println(arr[i - 1]);
//                break;
//            }
//        }

        Integer totalsSum = Arrays.stream(arr).boxed().reduce((a,b)->a+b).get();
        System.out.println("totalsSum - "+totalsSum);

        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            //System.out.println("sum of "+i+" th - "+ sum);
            int summ = totalsSum - sum;
            if(summ == sum){
                System.out.println("index - "+ i);
            }
            sum+= arr[i];

        }

        // ==> 28 --  8-3-17 --- > 28 - (11 + 6)  == 11
        // totalSum - (a[i] + a[i]) == a[i-1]














    }

}

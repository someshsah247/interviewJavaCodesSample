package com.learn.basics.interview;

import java.util.Arrays;

public class IBSSoftwarres {
    //        Write a program to find missing number in array
    //        arr[2,3,1,6,5]
    public static void main(String[] args) {

        int[] arr = new int[]{2,3,1,6,5};

        Arrays.sort(arr); /// 1,2,3,5,6
        int start = 1;
        for(int i = 0 ; i<arr.length-1 ; i++ ){
            if((arr[i] != start)){
                System.out.println("Missing Number - "+ start);
            }
            ++start;
        }
    }
}

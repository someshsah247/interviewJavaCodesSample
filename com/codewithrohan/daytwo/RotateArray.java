package com.codewithrohan.daytwo;

import java.util.ArrayList;

// arr=[1,2,3,4,5], rotation=2 ==> arr={4,5,1,2,3} clockwise rotation
// arr=[1,2,3,4,5], rotation=5 ==> arr={1,2,3,4,5}
/*
 1,2,3,4,5 -->
 5,1,2,3,4
 4,5,1,2,3,
 3,4,5,1,2
 2,3,4,5,1
 1,2,3,4,5

 */
public class RotateArray {

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5};
        int[] returnArray = rotaionArray(arr, 2);
    }

    private static int[] rotaionArray(int[] arr, int rotaion) {
        int[] tempArray = new int[arr.length];
        for (int i = 0 ; i<= rotaion ; i++){
            //tempArray[i] = arr[];
            for (int j = rotaion; j < arr.length - rotaion ; j--) {

            }
        }
        return tempArray;
    }


}

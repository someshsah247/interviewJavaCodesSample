package com.learn.basics.interview;

import java.util.Arrays;
import java.util.List;

public class MphasisL1 {
    public static void main(String[] args) {
        //input [3,0,8,7,0,0,12,1,8,0]
        //output [3,8,7,12,1,8,0,0,0,0]

        int[] arr = new int[]{3,0,8,7,0,0,12,1,8,0};
        List list = Arrays.stream(arr).boxed().sorted((x, y)->y-x).toList();
        System.out.println(list); // [12, 8, 8, 7, 3, 1, 0, 0, 0, 0]

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                //if(arr[j]==0 && arr[i]>0){
                if(arr[i]==0 && arr[j]>0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Input [3,8,7,12,1,8]
        // output  [3O,8E,7O,12E,1O,8E]
        int[] arr2 = new int[]{3,8,7,12,1,8};
        List<String> list1 = Arrays.stream(arr2).boxed()
                .map(x->x%2==0 ? String.valueOf(x+"E") : String.valueOf(x+"O")).toList();
        System.out.println(list1); // [3O, 8E, 7O, 12E, 1O, 8E]

    }
}

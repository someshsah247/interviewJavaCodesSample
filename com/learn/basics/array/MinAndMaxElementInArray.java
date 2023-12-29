package com.learn.basics.array;

import java.util.Arrays;

public class MinAndMaxElementInArray {

    public static void main(String[] args) {

        int[] arr = new int[]{2,4,90,34,65,12,42,11,55};

        // step 1 -- sorting
        // then 1st element is smallest and last element is largest.

        //BubbleSort
        // Outer loop
        for (int i = 0; i < arr.length-1; i++) {
            // Inner nested loop pointing 1 index ahead
            for (int j = 0; j < arr.length-1-i; j++) {
                    if(arr[j+1]>arr[j]){
                        swap(arr,j+1,j);
                    }
            }
//            System.out.print(arr[i]+ " ");
//            System.out.println();
        }

        //printing
        Arrays.stream(arr).forEach(System.out::print);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}

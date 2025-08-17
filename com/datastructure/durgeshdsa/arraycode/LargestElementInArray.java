package com.datastructure.durgeshdsa.arraycode;

import java.util.*;
import java.util.Arrays;

public class LargestElementInArray {

    private static void getLargestElementInArray(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Highest Element in given Array is : " + max);
    }

    private static void nthLargestElementArray(int arr[], int nth) {
        // remove duplicates if present
        // sort the array
        // reverse it -- count element and retuen the elemnet

        // List<Integer> list =
        // Arrays.stream(arr).boxed().sorted((x,y)->y-x).distinct().toList();
        // System.out.println("Higest Element in given Array is : "+ list);

        int max = Arrays.stream(arr).boxed().sorted((x, y) -> y - x).distinct().toList().get(nth - 1);
        System.out.println("Highest Element in given Array is : " + max);
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 4, 5, 6, 7, 1, 2, 4, 98, 99, 43, 21, 41, 61, 71 };
        getLargestElementInArray(arr);
        nthLargestElementArray(arr, 4);

    }
}

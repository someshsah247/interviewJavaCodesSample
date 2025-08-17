package com.datastructure.durgeshdsa.arraycode.search;

/***
 * Start from the first element of the array.
 * Compare each element with the target (searched value).
 * If a match is found, return the index/location of the element.
 * If no match, continue to the next element and repeat.
 * If the end of the array is reached without finding a match, return -1 (or indicate "not found").
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 4, 5, 6, 7, 1, 2, 4, 98, 99, 43, 21, 41, 61, 71 ,55, 63, 8 };
        int pos = search(arr, 71);
        // int pos = search(arr, 717865);
        if(pos>0) {
            System.out.println("Found at "+pos+ " position");
        } else  {
            System.out.println("Not Found");
        }
    }

    private static int search(int[] arr, int element) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(element == arr[i]){
                index = i;
            }
        }
        return index;
    }
}

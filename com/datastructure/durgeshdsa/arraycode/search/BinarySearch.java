package com.datastructure.durgeshdsa.arraycode.search;

public class BinarySearch {

    private static int binarySearch(int[] arr, int target) {
        int high = arr.length - 1;
        int low = 0;

        while (low <= high){
            // find mid element
            int mid = low + (high - low) / 2;

            if(arr[mid] == target){
                return mid;     // return the index
            } else if(target > arr[mid]){
                low = mid + 1;  // move to the right half
            } else {
                high = mid - 1; // move to the left half
            }
        }
        return -1; // return -1, if not found
    }


    public static void main(String[] args) {
        int[] arr = new int[] { 2, 4, 5, 6, 7, 11, 23, 41, 55, 57, 63, 69, 88, 98, 99, 100 };
        int pos = binarySearch(arr, 88);
        // int pos = binarySearch(arr, 717865);
        if(pos>0) {
            System.out.println("Found at "+pos+ " position");
        } else  {
            System.out.println("Not Found");
        }
    }

}

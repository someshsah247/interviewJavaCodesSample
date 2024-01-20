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

/*
 * 
 * import java.util.*;
import java.util.stream.*;

class GeeksforGeeks{
    
    //optimize
    static int findMin(int[] arr){
        int min = arr[0]; // inko higest value bhi use kr sakte gai Integer.MAX_VALUE
        int len = arr.length;
        for(int i=1; i< len ; i++){ // yaha i=1 because we alredy process 0th element.
            if(min>arr[i]){
                min = arr[i];
            }
        }
       return min; 
    }
    
    // not optimize
        static int findMax(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length ; i++){
            if(max<=arr[i]){
                max = arr[i];
            }
        }
       return max; 
    }
   
    
    public static void main (String[] args){
        int[] arr = new int[]{55,1,1,2,3,4,8,35};
         System.out.println(findMin(arr));
         System.out.println(findMax(arr));
    }
}

 */

 /*
  *          List<Integer> list = List.of(55,1,1,2,3,4,8,35);

         
         Integer var = list.stream().max(Integer::compare).get();
        System.out.println(var);
        
         Integer var1 = list.stream().min(Integer::compare).get();
        System.out.println(var1);
  */

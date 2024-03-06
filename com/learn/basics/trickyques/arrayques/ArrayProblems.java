package com.learn.basics.trickyques.arrayques;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayProblems {

    //Printing Arrays Element
    private static void printArrMethod(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    // remove element from array
    private static void removeElement(int arr[], int num){
        // 1st way
        // remove element from given array and shift right side element into left side.
        // last wala element to blank reh jaye ga.


        // 2nd way
        // create new array and do not copy removed element and retuen new array
        int duplicate = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == num){
                duplicate++;
            }
        }
        int[] newArr = new int[arr.length-duplicate];
        int index=0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] != num){
                newArr[index] = arr[i];
                index++;
            }
        }


        // 3rd way
        // assign unreleased value. like -1.
//        for (int i = 0; i < arr.length ; i++) {
//            if(arr[i] == num){
//                arr[i] =-1; //putting -1
//            }
//        }
        printArrMethod(newArr);
    }



    // sort array acs and desc
    private static void sortAsc(int arr[]){
        Arrays.stream(arr).boxed().sorted((x,y)->x-y).forEach(System.out::println);
    }

    private static void sortDesc(int arr[]){
        Arrays.stream(arr).boxed().sorted((x,y)->y-x).forEach(System.out::println);
    }

    // 3rd higest
    private static void nthHigestNormal(int[] arr, int high){
        // Important *
        Arrays.sort(arr);
        int i = arr.length-1;
        int hVal = 1;
        while(i>=0){ // 1,2,2,5,5,7
            if(arr[i]>arr[i-1]){
                hVal++;
            }
            i--;

            if(hVal == high){
                System.out.println("Higest "+ arr[i]);
                break;
            }
        }

        // lambdas
        Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder()).skip(high-1).limit(1).forEach(System.out::print);

        // Using tree set
//        TreeSet<Integer> ts = new TreeSet<>();
//        for (int i = 0; i < arr.length; i++) {
//            ts.add(arr[i]);
//        }
//        //System.out.println(ts);
//        for (int i = 1 ; i <= high ; i++) {
//            int num = ts.pollLast();
//            if(i==high){
//                System.out.println(num);
//            }
//        }

    }

    private static void findDuplicate(int[] arr){
        Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).
                entrySet().stream().forEach(x->{
                    if(x.getValue()>1){
                        System.out.println (x.getKey()+ " - " + x.getValue());
                    }
                });

        // 2nd way
        // using hash map
    }

    // find largest and smallest element in array
    private static void largestElement(int arr[]){

        //lambda
        System.out.println("Highest - "+Arrays.stream(arr).boxed().max((x, y) -> x-y).get());

//        //2nd way
//        Arrays.sort(arr);
//        System.out.println("Highest - "+arr[arr.length-1]);

//        //normal
//        int highest = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]>highest){
//                highest=arr[i];
//            }
//        }
//        System.out.println("Highest - "+highest);
    }

    private static void smallestElement(int arr[]){

        //lambda's
        System.out.println("Lowest - "+ Arrays.stream(arr).boxed().min((x,y)->x-y).get());

//        //2nd way
//        Arrays.sort(arr);
//        System.out.println("Lowest - "+arr[0]);

        //normal
//        int lowest = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]<lowest){
//                lowest=arr[i];
//            }
//        }
//        System.out.println("Lowest - "+lowest);
    }

    //  find duplicate elements in an array

    // equality of two arrays?  -- Array.equals()
    // anagram array

    // *  find all pairs of elements in an integer array whose sum is equal to a given number?
    private static void findPair(int[] arr, int sum){
        // to make it efficient - sort it then find
        Arrays.sort(arr);
        printArrMethod(arr);



        // less efficient
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if(sum == arr[i]+arr[j]){
//                    System.out.println("SUM - "+ arr[i]+" "+arr[j] );
//                }
//            }
//        }
    }


    // *  find continuous sub array whose sum is equal to a given number?

    // mearge 2 array .

    private static void meargeSimpleArray(int[] arr1 , int[] arr2){
        int[] newArr = new int[arr1.length + arr2.length];
        System.arraycopy(arr1,0,newArr,0,arr1.length);
        System.arraycopy(arr2,0,newArr,arr2.length,arr2.length);


//        int[] newArr = new int[arr1.length + arr2.length];
//        int index = 0;
//        for (int i = 0; i < arr1.length ; i++) {
//            newArr[index++]=arr1[i];
//        }
//        for (int i = 0; i < arr2.length ; i++) {
//            newArr[index++]=arr2[i];
//        }

        printArrMethod(newArr);
    }

    private static void meargeSortedArray(int[] arr1 , int[] arr2){
        int[] newArr = new int[arr1.length + arr2.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min heap
        //PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a); // max Heap
        for (int i = 0; i < arr1.length ; i++) {
            pq.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length ; i++) {
            pq.add(arr2[i]);
        }

        int index =0;
        while (!pq.isEmpty()){
            newArr[index++] = pq.poll();
        }
        printArrMethod(newArr);
    }

    // separate zeros from non-zeros in an integer array or separate 0 and 1 in array.

    // reverse an array without using an additional array?



    public static void main(String[] args) {
        int[] arr = new int[]{5,7,2,1,5,2};
                //{98,67,12,14,43,21,76,36,9,87,50,78,14};
        int[] arr2 = new int[]{4,8,3,2,6,9};

        removeElement(arr,5);

        //sortAsc(arr);
        //sortDesc(arr);

        //nthHigestNormal(arr, 3);

        //findDuplicate(arr);

        //meargeSimpleArray(arr,arr2);

        //meargeSortedArray(arr,arr2);

//        smallestElement(arr2);
//
//        largestElement(arr2);

       // findPair(arr,9);

    }

}

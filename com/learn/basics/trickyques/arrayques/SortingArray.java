package com.learn.basics.trickyques.arrayques;

public class SortingArray {
    // bubble sort algorithm's average/worst time complexity is O(n²)
    public static void main(String[] args) {
        int[] arr = {4,1,2,5,3};
        sortMyArr(arr); // o/p - 1 2 3 4 5

        int[] arr2 = {1,0,2,0,3,4,0,0,5,0};
        moveAllZeroAtLast(arr2); // o/p - 1 2 3 4 5 0 0 0 0 0
    }

    private static void moveAllZeroAtLast(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]==0  && arr[j]!=0){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        printArrMethod(arr);
    }

    private static void sortMyArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        printArrMethod(arr);
    }

    private static void printArrMethod(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

}
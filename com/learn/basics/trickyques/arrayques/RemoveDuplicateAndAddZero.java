package com.learn.basics.trickyques.arrayques;

public class RemoveDuplicateAndAddZero {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };

        for (int i = 0; i < arr.length - 1;) {
            if (arr[i] == arr[i + 1]) {
                int j = i + 1;
                while (j <= arr.length - 1 && arr[i] == arr[j]) {
                    arr[j] = 0;
                    j++;
                }
                i = j;
            } else {
                i++;
            }
        }


        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == 0 && arr[j] != 0) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}

package com.learn.basics.array;

import java.util.Arrays;

public class CompaireTwoArr {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2,4,9,5,1};
        int[] arr2 = new int[]{4,5,2,9,1};

        int a = arr1.length;
        int b = arr2.length;

        // compare both array is equal.

//        if(arr1.length != arr2.length){
//            System.out.println("Not Equal");
//            System.exit(0);
//        }else {
        if(a == b){
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            for (int i = 0; i < arr1.length; i++) {
                if(arr1[i]!=arr2[i]){
                    System.out.println("Not Equal");
                    System.exit(0);
                }
            }

        }
        System.out.println("Equal");

    }

}

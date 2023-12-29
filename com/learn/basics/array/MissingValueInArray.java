package com.learn.basics.array;

public class MissingValueInArray {
    public static void main(String[] args) {

        //NOTE -- Should not contain any DUPLICATES.
        // it is not in sorting order.
        // values must be in some range like b/w 1-100.

        int[] a = new int[]{1,2,3,4,6,7}; // 4 is missing.

        // sum of all present element
        // sun of all elements
        int sumArrayAll = 0;
        int sumAll =0; // yeha pe array ke elements ka sum like - 1+2+3+4+6+7


        for (int i = 0; i < a.length-1; i++) {
            sumArrayAll+= a[i];
        }
        for (int i = 0; i <= a.length; i++) {
            sumAll+= i; // total number ka sum like - 1+2+3+4+5+6+7
        }

        System.out.println("missing element is  = "+ (sumAll-sumArrayAll));



    }
}

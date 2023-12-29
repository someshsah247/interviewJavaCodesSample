package com.learn.basics.array;

import java.util.Arrays;

public class ArraysEqual {
    public static void main(String[] args) {

        int[] a = new int[]{2,3,4,5,6};
        int[] b = new int[]{2,3,4,5,6};

        boolean statusEqual = true;

        // boolean statusEqual = false;
       // statusEqual = Arrays.equals(a,b); //

        if(a.length == b.length){
            for (int i = 0; i < a.length-1 ; i++) {
                if(a[i]!=b[i]){
                    statusEqual = false;
                }
            }
        }else {
            statusEqual =false;
        }


        if(statusEqual)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}

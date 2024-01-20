package com.learn.basics.array;

import java.util.Arrays;

// isme 0 and 1 ka b array hota h -- usme se -- 0 and 1 ko alag krna hota h
public class PrintEvenOddFromArray {
    public static void main(String[] args) {

        //TODO: 0 is coming on the output

        int[] a = new int[]{10,2,3,4,5,6,7,8,9,10,11,12,13};
        int[] even = new int[a.length];
        int[] odd = new int[a.length];

        for (int i = 0,j=0,k=0; i < a.length; i++) {
            if(a[i]%2==0){
                even[j]=a[i];
                j++;
            }else{
                odd[k]=a[i];
                k++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if(a[i]!=0)
            System.out.print(even[i] + " ");
        }

        System.out.println(" \n ===========");

        for (int i = 0; i < a.length; i++) {
            if(a[i]!=0)
            System.out.print(odd[i]+" ");
        }

    }
}

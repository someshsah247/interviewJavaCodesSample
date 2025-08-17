package com.datastructure.arraycode;

import java.util.Arrays;

public class StaticArray {

    public static void main(String[] args) {

        // static array is already available

        // integer array
        int intArr1[] = new int[] {1,2,3,4,5};

        // String array
        String[] strArr2 = new String[5];
        strArr2[0] = "A";
        strArr2[1] = "B";
        strArr2[2] = "X";
        strArr2[3] = "Y";
        strArr2[4] = "Z";

        Arrays.stream(intArr1).forEach(x-> System.out.print(x+ " "));
        System.out.println();
        Arrays.stream(strArr2).forEach(x-> System.out.print(x+ " "));


    }
}

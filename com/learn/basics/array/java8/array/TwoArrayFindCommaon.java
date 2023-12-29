package com.learn.basics.array.java8.array;

import java.util.Arrays;


public class TwoArrayFindCommaon {
    public static void main(String[] args) {
        int[] numArray1 = {5,6,3,7,1,9,2,2};
        int[] numArray2 = {3,8,3,7,4,10,12,2};
        Arrays.stream(numArray1).filter((number)->Arrays.stream(numArray2).anyMatch(number2 -> number==number2)).forEach(System.out::print);
    }
}

package com.learn.basics.array.java8.array;

import java.util.Arrays;
import java.util.OptionalInt;

public class FindSecondSmallest {

    public static void main(String[] args) {

        int[] numArray = {5,6,3,7,1,9,2,2};

        //OptionalInt requriedNum = Arrays.stream(numArray).sorted().skip(1).findFirst();
        OptionalInt requriedNum = Arrays.stream(numArray).distinct().sorted().skip(1).findFirst();
        System.out.println(requriedNum.getAsInt());
    }
}

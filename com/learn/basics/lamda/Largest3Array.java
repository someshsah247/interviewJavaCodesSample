package com.learn.basics.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Largest3Array {

    public static void main(String[] args) {

        int[] intArr = new int[]{4,87,7,3,2,9,0,1,3,2,2,56,43,12,12,23,34,45,56,67,78,89,97,64,31,32,43,54,65,76,87,98,1,10};

        List<Integer> list =Arrays.stream(intArr).boxed().sorted().limit(3).toList();

        System.out.println(list);

        // find out all number starting with 2

        // find n largest number in an array

    }

}

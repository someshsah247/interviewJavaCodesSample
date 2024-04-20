package com.learn.basics.interview;

import java.util.Arrays;

public class Coforge {
    public static void main(String[] args) {
        Integer arr[] = {1,14,234,56,25,86,90,101,77};
        System.out.println( Arrays.stream(arr).sorted((x,y)->y-x).limit(3).skip(2).toList());
    }
}

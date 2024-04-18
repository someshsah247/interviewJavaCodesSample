package com.learn.basics.interview;

import java.util.Arrays;
import java.util.List;

public class Capgemini2 {
    public static void main(String[] args) {
        int[] arr = new int[]{32,54,12,13,43,99,87,36,43};

        //2nd largest
        List listLargest = Arrays.stream(arr).boxed().distinct().sorted((x, y)->y-x).limit(2).skip(1).toList();
        System.out.println(listLargest.get(0));
        //Square
        List listSquare = Arrays.stream(arr).boxed().map(x->x*x).toList();
        System.out.println(listSquare);

    }
}

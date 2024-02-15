package com.learn.basics.interview;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Capgemini {
    public static void main(String[] args) {

        // using java 8 find out 2nd highest element from given integer array.

        int[] arr = new int[]{32,54,12,13,43,99,87,36,43};

        List<Integer> list =
                Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).limit(2).skip(1).toList();

        System.out.println(list);
    }
}

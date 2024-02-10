package com.learn.basics.lamda;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeTwoList {
    public static void main(String[] args) {

        int[] arr1 = new int[]{2,6,3,1,8,9};
        int[] arr2 = new int[]{42,56,93,21,18,89};

        List<Integer> l1 = new ArrayList<>();
        l1.add(6); l1.add(9); l1.add(5);
        l1.add(2); l1.add(7); l1.add(1);

        List<Integer> l2 = new ArrayList<>();
        l2.add(16); l2.add(29); l2.add(35);
        l2.add(92); l2.add(77); l2.add(41);

        //
        Stream<IntStream> meargeStream = Stream.of(Arrays.stream(arr1),Arrays.stream(arr2));
        //Object[] obj =  s.toArray();
       // List<St> listx = meargeStream.distinct().collect(Collectors.toList());


    }

}

package com.learn.basics.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NTTDATA {

    /*
    how to find frequency of each character in a string using java 8 stream
     */


    public static void main(String[] args) {
        String word = "somesh";
        int[] arr = new int[]{4,5,2,21,1,5,98,76,12,45};

        Arrays.stream(word.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).forEach((x,y)-> System.out.println(x +" - "+y));

        System.out.println(Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).limit(1).toList().get(0));
        System.out.println(Arrays.stream(arr).boxed().sorted(Comparator.naturalOrder()).limit(1).toList().get(0));

//        System.out.println("MAX - "+Arrays.stream(arr).boxed().max(Comparator.naturalOrder()).get());
//        System.out.println("MIN - "+Arrays.stream(arr).boxed().min(Comparator.naturalOrder()).get());

    }



}


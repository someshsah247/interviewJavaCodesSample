package com.learn.basics.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;



public class Azentio {
    public static void main(String[] args) {
        //System.out.println("working.");
        String s = "somesh";
        String arr[] = s.split("");

        //Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().sorted()
        long x = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .findFirst().get().getValue().longValue();


/*
        HashMap map = (HashMap) Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(), counting()));
        System.out.println(map);
        Integer max = 0;
        for (int i = 0; i < map.size(); i++) {
            if ( Integer.parseInt((String) map.get(arr[i])) > max) {
                max = Integer.parseInt((String) map.get(arr[i]));
            }
        }
        System.out.println("max value is"+ max);

 */
    }

}

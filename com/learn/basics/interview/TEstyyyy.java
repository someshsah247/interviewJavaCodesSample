package com.learn.basics.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@FunctionalInterface
interface Student{
    int dueFee(int fee);
}

public class TEstyyyy {
    public static void main(String[] args) {
        int totalFee = 1000;
        Student s = x->totalFee-x;

        //System.out.println(Student::dueFee(300));

        int[] arr = new int[] {1,2,3,4,3,7,6};


        //  Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),HashMap::new, Collectors.counting())).entrySet();

        System.out.println(Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),HashMap::new, Collectors.counting())).entrySet());
    }
}

package com.learn.basics.lamda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberLambda {

    private static void largestOfN(int[] intArr,int index) {
        // 1) Find top 3 largest numbers in array (or top 3 min)
        Arrays.stream(intArr).boxed()
                .distinct()  // you can also remove it.
                .sorted()
                .limit(index)
                .skip(index-1)
                .forEach(System.out::println);
                //.collect(Collectors.toList());
    }

    private static void allNumberStartingWith(int[] intArr, int num) {
        // 2) Find all numbers starting with 1 or any number
        System.out.println(
        Arrays.stream(intArr).boxed()
                .map(x->x+"") // just converting it into string.
                .filter(x -> x.startsWith(String.valueOf(num)))
                //.forEach(System.out::println);
                .toList()
        );
    }

    private static void getAllDuplicateElements(int[] intArr) {
        //3) Find duplicate elements in array
        Arrays.stream(intArr).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x->x.getValue()>1) // if we removed -- then it is frequencies code
                .forEach((x)-> System.out.println(x.getKey()+" - - "+x.getValue()));
    }

    private static void totalArrayElements(int[] intArr) {
        //4) Find total number of elements in array
        System.out.println(
                Arrays.stream(intArr).boxed().count()
        );
    }

    private static void findMinMaxNumber(int[] intArr) {
        // 5) Find min and max number in array
        int min = Arrays.stream(intArr).boxed().min(Integer::compare).get();
        int max = Arrays.stream(intArr).boxed().max(Integer::compare).get();
        System.out.println(min +" - "+ max);
    }

    private static void sortInBothWays(int[] intArr) {
        // 8) Sort array using Streams/ Sort in reverse order
        List<Integer> ascSort = Arrays.stream(intArr).boxed()
                .sorted().collect(Collectors.toList());

        List<Integer> descSort = Arrays.stream(intArr).boxed()
                .sorted(Comparator.reverseOrder()).toList();

        System.out.println(ascSort +" \n "+ descSort);
    }



    public static void main(String[] args) {
        int[] intArr = new int[]{4,87,7,3,2,9,0,1,3,2,2,56,43,12,12,23,34,45,56,67,78,89,97,64,31,32,43,54,65,76,87,98,1,10,
                324,654,765,456,987,678,456,325,763,693,298};

        System.out.println("Actual Int Array");
        System.out.println(Arrays.stream(intArr));

        System.out.println(" \n ============================================= \n ");

        System.out.println("1 Find top 3 largest numbers in array (or top N min)");
        largestOfN(intArr,3);

        System.out.println(" \n ============================================= \n ");

        System.out.println("2) Find all numbers starting with 1 ");
        allNumberStartingWith(intArr, 1);

        System.out.println(" \n ============================================= \n ");

        System.out.println("3) Find duplicate elements in array ");
        getAllDuplicateElements(intArr);

        System.out.println(" \n ============================================= \n ");

        System.out.println("4) Find total number of elements in array");
        totalArrayElements(intArr);

        System.out.println(" \n ============================================= \n ");

        System.out.println("5) Find min & max number in array ");
        findMinMaxNumber(intArr);

        System.out.println(" \n ============================================= \n ");

        System.out.println("8) Sort array using Streams/ Sort in reverse order  ");
        sortInBothWays(intArr);

        System.out.println("8) Sort array using Streams/ Sort in reverse order ");





    } // main method close




}

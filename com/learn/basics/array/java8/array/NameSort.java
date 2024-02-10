package com.learn.basics.array.java8.array;

import java.util.Arrays;
import java.util.List;

public class NameSort {

    public static void main(String[] args) {
        List<String> stringList = List.of("somesh","yesh","rajat","akash","ajay","yogesh");
        //stringList.stream().sorted().forEach(System.out::println);
        stringList.stream().sorted().forEach( x ->
                System.out.print(x+" ")
        );

        // length of each word in array
        String[] words = new String[]{"somesh","yesh","rajat","akash","ajay","yogesh"};
        List list =Arrays.stream(words).map(String::length).toList();
        System.out.println(list);

        // length of each word in string
        String sentance = "Hum Hoge Kamiyab ek Din, hai man me hai visvash";
        Arrays.stream(sentance.split(" ")).map(String::length).forEach(System.out::println);

    }

}

package com.learn.basics.strems;

import java.util.List;
import java.util.stream.Collectors;

// Find Out even numbers

public class PlayWithNumbers {

    public static void main(String[] args) {

        List<Integer> list = List.of(-80,-70,-55, -30, 10,15,20,50,58,69,85,100 );

        // even numbers
        System.out.println(
        list.stream()
                .filter((x)->x%2==0)
                .collect(Collectors.toList())
        );

        // Number greater then 20
        System.out.println(
                list.stream()
                        .filter((x)->x>20)
                        .collect(Collectors.toList())
        );

        // Number smaller then 20
        System.out.println(
                list.stream()
                        .filter((x)->x<20)
                        .collect(Collectors.toList())
        );

    }
}

package com.learn.basics.array.java8.array;

import java.util.Comparator;
import java.util.List;

public class SecondHigest {

    public static void main(String[] args) {

        List<Integer> list = List.of(3,5,16,7,8,2,1,4,6,10,2);

        System.out.println(
            list.stream().sorted().skip(1)
        );

    }

}

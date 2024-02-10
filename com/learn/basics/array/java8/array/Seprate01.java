package com.learn.basics.array.java8.array;

import java.util.List;
import java.util.stream.Collectors;

public class Seprate01 {

    public static void main(String[] args) {

        Integer[] intArr = new Integer[]{0,1,1,1,1,0,1,0,0,0,1,0,1,0,0,1,1,0,1,1,1,1,1,0,0,0};

        List<Integer> list = List.of(intArr);

        // for evenNumbers
        List<Integer> newListEven = list.stream().filter(x->x%2==0).toList();
        // for odd numbers
        List<Integer> newListOdd = list.stream().filter(x->x%2!=0).toList();

        System.out.println(newListEven);
        System.out.println(newListOdd);


    }

}

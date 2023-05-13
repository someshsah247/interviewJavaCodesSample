package com.learn.basics.strems;

import java.util.Arrays;
import java.util.List;

// https://www.youtube.com/watch?v=fKtQGUHk4Ds&list=PL5mjp3QjkuoIwKEuf-mRqDCWeXdGzuYwD&index=1&ab_channel=ProgRank

public class FindNthHightest {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,15,35,12,40,100,80,65);

        System.out.println( "1--  " +list.stream().sorted().findFirst());
        // stream() -- convert list into strem
        // sorted() -- provide normal sorting asendining order
        // findFirst() or findAny() -- will give result in Optional;
        System.out.println("2--  " +list.stream().sorted().findFirst().get()); // to get value directly ;

        //Now we need to use comparator  --sored() will take comparator oject
        System.out.println( "3--  " +list.stream().sorted((x, y) -> x-y).findFirst()); // for accenting sorting
        System.out.println( "4--  " +list.stream().sorted((x,y) -> y-x).findFirst()); // for descending sorting


        // For 2nd higest Element  -- skip(1) is used
        System.out.println( "5--  " +list.stream().sorted((x,y) -> y-x).skip(1).findFirst());

        // For 3rd higest Element  -- skip(2) is used
        System.out.println( "6--  " +list.stream().sorted((x,y) -> y-x).skip(2).findFirst());

    }
}

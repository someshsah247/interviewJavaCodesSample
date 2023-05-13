package com.learn.basics.strems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//https://www.youtube.com/watch?v=wWSKQKKQZKY&list=PL5mjp3QjkuoIwKEuf-mRqDCWeXdGzuYwD&index=2&ab_channel=ProgRank

public class OccurrenceOfWords {

    public static void main(String[] args) {
        List<String > list  = Arrays.asList("Rahul", "Raj" , "Golu", "somesh", "Shalini", "Ankit" ,"Akash", "somesh", "Shalini" );

        System.out.println(
        list.stream()
                .collect(Collectors.groupingBy((i)-> i , Collectors.counting()))
        );
    }
}

package com.learn.basics.strems;

import java.util.stream.Collectors;

//https://www.youtube.com/watch?v=wWSKQKKQZKY&list=PL5mjp3QjkuoIwKEuf-mRqDCWeXdGzuYwD&index=2&ab_channel=ProgRank

public class OccurrenceOfCharectors {

    public static void main(String[] args) {

        String word = "somesh";

        System.out.println(
        word.chars() // it will give integer array -- in assci code.
                .mapToObj((x)-> (char) x) // type casting is impt other wise it will give result in ascci code.
                .collect(Collectors.groupingBy((i)->i ,Collectors.counting()))
        );
    }
}

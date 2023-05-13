package com.learn.basics.strems;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamObjects {

    public static void main(String[] args) {

        //Bank Stream
        Stream<Objects> blankStream = Stream.empty();
        //blankStream we are able to perform allloperations here.
        System.out.println( "blankStream -- "+ blankStream);

        //Using String array
        String[] names = new String[] {"Somesh","Sah","Shalini","Rajat","Rohit"};
        Stream<String> nameStream = Stream.of(names);
        System.out.println( "nameStream -- "+ nameStream); // java.util.stream.ReferencePipeline$Head@3b07d329
        System.out.println( "nameStream -- "+ nameStream.collect(Collectors.toList()));
        //System.out.println( "nameStream -- "+ nameStream.toList()); // same as above.

        //Using Array
        List<String> allNames = Arrays.asList("Somesh","Sah","Shalini","Rajat","Rohit","Ram" ,"Shayam","Rohan");
        //display using foreach
        allNames.forEach((i)-> System.out.println("print form foreach -- "+ i ));

        //Using stram builder
        Stream s = Stream.builder().build();
        System.out.println("builder -- "+ s.collect(Collectors.toList()));

    }

}

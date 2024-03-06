package com.learn.basics.strems;

import java.util.stream.IntStream;

public class Parallel_and_NormalStream {

    public static void main(String[] args) {
        long start = 0 ;
        long end = 0 ;

        //Parallel Stream
        start = System.currentTimeMillis();
        IntStream.range(1,100).boxed().parallel().forEach(x->System.out.print(x+" "));
        end = System.currentTimeMillis();
        System.out.println("Total Time - "+ (end-start));

        //Normal Stream
        start = System.currentTimeMillis();
        IntStream.range(1,100).boxed().forEach(x->System.out.print(x+" "));
        end = System.currentTimeMillis();
        System.out.println("Total Time - "+ (end-start));

    }

}

package com.learn.basics.othercodes;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.stream.Stream;

// TenRandomNumber using forEach()
public class TenRandomNumber {

    public static void main(String[] args) {

        Random random = new Random();
        //random.ints().limit(10).forEach(System.out::println);
        random.ints(5, 100).limit(10).forEach(System.out::println);
    }
}

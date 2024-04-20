package com.learn.basics.interview;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Hexaware implements Runnable{
    // select in 1st round.

    @Override
    public void run() {
        System.out.println("inside run");
    }

    public static void main(String[] args) {
        // implement thread
        Hexaware h = new Hexaware();
        Thread t = new Thread(h);
        t.start();

        // from given list create map.
        List<String> list = List.of("a","b","c");
        System.out.println( list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet());
    }

}

/*

class MyThread implements Rumanle{

@override
public void run(){
	SOP("something");
}

psvm(){
	Thread t = new Thread();
	t.start();
}
}

List<String> list = List.of("a","b","c");

list.stream().collect(Collects.groupingBy(Function.identity,counting)).entrySet();

 */
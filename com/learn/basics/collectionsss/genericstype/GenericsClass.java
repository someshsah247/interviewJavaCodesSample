package com.learn.basics.collectionsss.genericstype;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class GenericsClass <T>{


    public GenericsClass(){
        System.out.println("GenericsClass of ");
    }

    public Integer add(T num1 , T num2){
        return (Integer) num2;
    }

}

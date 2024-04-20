package com.learn.basics.interview;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LTAMindTree2 {
    public static void main(String[] args) {
        // Find first repeating character from given string.
        String s = "abcbc";

        System.out.println(
                Arrays.stream(s.split(""))
                        .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                        .entrySet().stream().filter(x->x.getValue()>1).findFirst()
        );
    }
}

/*

List<Emp>  e1,e2,e3
 name , age , salary ,  -- 3 objects

 name - salary

 HashMap<String,String> map = list.stream().collect(Collects.groupingBy(x->x.getName(),Emp::getSalary())).entrySet();

 map(x-> new Emp(name, age , salay*2))


 x.y.z  ---> header.payload.secret(signature)
 -- @Emp

 String s = "abcbc";

 Map map  = Arrays.stream(s.split()).collect(Collects.grouplingBy(Function.identity(),)Collecta.counting()).entrySet().forEach(x-> Sys x.getkey())

 */
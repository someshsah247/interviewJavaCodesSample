package com.learn.basics.interview;

import java.util.List;

public class Cyient {
    public static void main(String[] args) {
        List<String> names = List.of("somesh","rohan","rahula");
        List newList = names.stream().filter(x->x.charAt(0) == 's').toList();
        System.out.println(newList);    }
}

/*
-- top salary

select * from emp where salary in (select salary from emp order by salary desc) limit 2 ;	// my sql

lsit == somesh , ram , golu

List newList = list.stream().filter(x->x.charAt(0) == 's').collect.toList();

 */
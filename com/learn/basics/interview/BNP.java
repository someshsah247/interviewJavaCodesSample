package com.learn.basics.interview;

import java.util.List;
import java.util.stream.Collector;

public class BNP {

    public static void main(String[] args) {

    }


 // Ques 1
    //Emp -- id and name
    // new (1,A);
    // nem (2,B);
    // new (1,D);s
    // new (3,C);

    // class EmpNAme implments Comparator{
    //     @Override
    //     public Emp compareTo(){
    //     }
    // }

// Ques 2
//    public static void main(String[] args) {
//        List<Integer> list = List.of(9,1,11,1,2,44,9);
//
//        list.stream().sorted().forEach(System.out::println);
//        //list.stream().collect(Collector.list());
//
//    }

    //     EMP  name and d.id
    //     Dpat -- id , salary

    //    select 
    //    emp.name , d.salary 
    //    from emp_table emp 
    //    LEFT OUTER JOIN dept_table d ON emp.id=d.id;


    //    select count(emp.id), d.id
    //    emp.name , d.salary 
    //    from emp_table emp 
    //    LEFT OUTER JOIN dept_table d ON emp.id=d.id
    //    group by d.id;


       





    
}

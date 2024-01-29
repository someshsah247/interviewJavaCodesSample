package com.learn.basics.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;

public class BNP {


    // 1st -- need to sort based on ID
    // 2nd -- if ID is same then sort using name.

    public static void main(String[] args) {
        Friend f1 = new Friend(1, "somesh");
        Friend f9 = new Friend(1, "Rohan");
        Friend f2 = new Friend(2, "Raj");
        Friend f11 = new Friend(2, "Rajveer");
        Friend f3 = new Friend(4, "Raja");
        Friend f22 = new Friend(8, "Rashmi");
        Friend f4 = new Friend(2, "Rahul");
        Friend f33 = new Friend(1, "Shalini");
        Friend f5 = new Friend(1, "Suraj");
        Friend f44 = new Friend(1, "Lokesh");
        Friend f6 = new Friend(5, "Manoj");
        Friend f55 = new Friend(7, "Yogesh");
        Friend f7 = new Friend(7, "Yesh");
        Friend f66 = new Friend(9, "Shanti");
        Friend f8 = new Friend(6, "aashish");
        Friend f77 = new Friend(10, "Sah");

        List<Friend> friendList = new ArrayList<>();
        friendList.add(f1);
        friendList.add(f2);
        friendList.add(f3);
        friendList.add(f4);
        friendList.add(f5);
        friendList.add(f6);
        friendList.add(f7);
        friendList.add(f8);
        friendList.add(f9);
        friendList.add(f66);
        friendList.add(f11);
        friendList.add(f22);
        friendList.add(f33);
        friendList.add(f44);
        friendList.add(f55);
        friendList.add(f77);

        friendList.sort(new FridendId());
        System.out.println(friendList);
    }
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


       





    


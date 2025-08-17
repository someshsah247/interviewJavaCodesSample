package com.interview25;

import java.util.*;
import java.util.stream.Collectors;

public class PublicisSapientInterface {
    public static void main(String[] args) {

        // Q1 --
        Employee emp = new Employee(1,"somesh",12345.0,new Date());
        HashMap<Employee,String> map = new HashMap<>();
        map.put(emp,"somesh");
        // changing emp name
        emp.setName("Raju");

        //Ques -- what will be print emp name if i print map?
        //System.out.println(map);
        //Ques -- what will be print emp name if i print emp object?
        //System.out.println(emp);


        // Ques 2
        List<Employee> list = new ArrayList<>();
        Employee e1 = new Employee(1,"somesh",12345.0,new Date());
        Employee e2 = new Employee(2,"rajet",12346.0,new Date());
        Employee e3 = new Employee(3,"rohit",123.0,new Date());
        Employee e4 = new Employee(4,"mickey",345.0,new Date());
        Employee e5 = new Employee(5,"somesh",543.0,new Date());
        list.add(e1); list.add(e2); list.add(e3); list.add(e4); list.add(e5);

        // Quesn -- want map out
        // want id and then emp object
        list.stream().collect(Collectors.groupingBy(Employee::getName))
                .entrySet()
                .forEach(k -> {
                    System.out.println(k.getKey() + " : " + k.getValue());
                });
    }


    // Question 3 -- SQL Question
    // id | name | manager_id
    // 1 | Bhola |
    // 2 | Somesh | 1
    // 3 | Rajat | 2
    // 4 | Rohit | 3

    // output
    // empName ManagerName
    // Rohit Rajat
    // Rajat Somesh
    // Somesh Bhola
    // Bhola NULL

}

package com.learn.basics.strems;

import com.learn.basics.classesfordemo.EmployeeClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindNthHightestOnEmpObj {

    public static void main(String[] args) {

        // getting list odf femp
        List<EmployeeClass> list = Arrays.asList(
                new EmployeeClass(10,"ram",100),
                new EmployeeClass(12,"shayam",110),
                new EmployeeClass(18,"kaju",150),
                new EmployeeClass(15,"kishmis",130),
                new EmployeeClass(13,"pista",135),
                new EmployeeClass(19,"boom",100),
                new EmployeeClass(14,"rocket",700),
                new EmployeeClass(16,"fan",180)
        );
        System.out.println(
        list.stream()
                .sorted((e1,e2)->  ( (int) e2.getSalary() - (int) e1.getSalary()))   // we nwwd to cast it , because of sort method
                .skip(1)
                .findFirst()
                .get()
        );

        //
        System.out.println(
                list.stream()
                        .sorted(Comparator.comparingDouble(EmployeeClass :: getSalary).reversed())   // we nwwd to cast it , because of sort method
                        .skip(1)
                        .findFirst()
                        .get()
        );

        // just want highest salary
         double higestSalary =list.stream()
                             .map((x)-> x.getSalary())
                             .sorted(Comparator.reverseOrder())
                             //.skip(2) // nth value
                             .findFirst()
                             .get();
        System.out.println(higestSalary);


    }
}

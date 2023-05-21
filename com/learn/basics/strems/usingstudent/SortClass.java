package com.learn.basics.strems.usingstudent;

import com.learn.basics.classesfordemo.StudentClass;

import java.util.stream.Collectors;

public class SortClass {

    public static void main(String[] args) {

        // get all names in sorted order
        System.out.println(
        StudentClass.getStudentData().stream()
                .map(x-> x.getName())
                .sorted()
                .collect(Collectors.toList())
        );

        // get all names -- sort by
//        System.out.println(
//                StudentClass.getStudentData().stream()
//                        .map( x.getPercentage())
//                        .sorted()
//                        .collect(Collectors.groupingBy())
//        );

    }
}

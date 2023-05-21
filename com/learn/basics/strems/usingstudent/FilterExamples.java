package com.learn.basics.strems.usingstudent;

import com.learn.basics.classesfordemo.StudentClass;

import java.util.Comparator;
import java.util.stream.Collectors;

public class FilterExamples {

    public static void main(String[] args) {

        //Age is greater then 20
        System.out.println(
        StudentClass.getStudentData().stream()
                .filter(x -> x.getAge()>20)
                .collect(Collectors.toList())
        );

        // Twist Quest By my Wife
        System.out.println( "age more then 20 & % max" +
        StudentClass.getStudentData().stream()
                .filter(x->x.getAge()>25)
                .max(Comparator.comparingDouble(StudentClass::getPercentage)).get()
        );
    }



}

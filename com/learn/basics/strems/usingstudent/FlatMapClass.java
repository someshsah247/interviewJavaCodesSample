package com.learn.basics.strems.usingstudent;

import com.learn.basics.classesfordemo.StudentClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapClass {

    public static void main(String[] args) {

        /*
        This is the case of flat map
        we have stsudent calss object
        inside this object we have activities ,it is angain a list.
        for this kind of scenario .. we are using FLAT MAP.
         */

        // ALl Activities will eb printed.
    StudentClass.getStudentData().stream()
            .map(StudentClass::getActivities)
            .flatMap(x->x.stream())
            .forEach(System.out::print );

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

    // only distinct wil print
        System.out.println( "using distinct --  "+
        StudentClass.getStudentData().stream()
                .map(StudentClass::getActivities)
                .flatMap(x->x.stream())
                .distinct()
                .collect(Collectors.toList())
        );

    }

}

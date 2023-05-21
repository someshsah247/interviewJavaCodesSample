package com.learn.basics.strems.usingstudent;

import com.learn.basics.classesfordemo.StudentClass;

import java.util.Comparator;
import java.util.stream.Collectors;

public class MaxMinPercentage {
    public static void main(String[] args) {

        System.out.println( "MIN % -- "+
                StudentClass.getStudentData().stream()
                .min(Comparator.comparingDouble(StudentClass::getPercentage)).get()
        );

        System.out.println("MAX % -- "+
                StudentClass.getStudentData().stream()
                        .max(Comparator.comparingDouble(StudentClass::getPercentage)).get()
        );

//        // Twist Quest By my Wife
//        System.out.println("AGE Sab se kaam & % sab se High --> "+
//                StudentClass.getStudentData().stream()
//                        .max(Comparator.comparingDouble(StudentClass::getPercentage)).get()
//
//        );

    }
}

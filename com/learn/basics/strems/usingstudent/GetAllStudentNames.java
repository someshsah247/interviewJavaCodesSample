package com.learn.basics.strems.usingstudent;

import com.learn.basics.classesfordemo.StudentClass;

import java.util.stream.Collectors;

public class GetAllStudentNames {

    public static void main(String[] args) {

        //Print all Data
        StudentClass.getStudentData().stream()
                .forEach(System.out::println);//.forEach((name)-> System.out.println(name));

        // Only print name
        StudentClass.getStudentData().stream()
                .map(StudentClass::getName)
                .forEach(System.out::println);


    }
}

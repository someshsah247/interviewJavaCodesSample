package com.learn.basics.classesfordemo;

import lombok.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentClass {

    private int id ;
    private String name;
    private double percentage;
    private int age;
    private String gender;
    private List<String> activities;

    public static List<StudentClass> getStudentData() {

        List<StudentClass> list = new ArrayList<StudentClass>();

        StudentClass s1 = new StudentClass(1,"Somesh",45.87,16,"male",Arrays.asList("Badminton", "Cricket","Bolly Ball"));
        StudentClass s2 = new StudentClass(2,"Shalini",54.77,17,"female",Arrays.asList("Kabdi", "Khokho","Table Tennis"));

        StudentClass s3 = new StudentClass(3,"Rohit",65.87,19,"male",Arrays.asList("Swimming", "Basket Ball","Dance"));
        StudentClass s4 = new StudentClass(4,"Bharti",84.77,20,"female",Arrays.asList("Reading", "Movies","Gaming"));

        StudentClass s5 = new StudentClass(5,"Rajat",99.87,22,"male",Arrays.asList("Long Jump", "Shot Put","Wrestling"));
        StudentClass s6 = new StudentClass(6,"Payal",24.77,24,"female",Arrays.asList("", "",""));

        StudentClass s7 = new StudentClass(7,"Anshu",65.88,36,"female",Arrays.asList("Badminton", "Chese","Khokho"));
        StudentClass s8 = new StudentClass(8,"Santhosh",94.77,38,"male",Arrays.asList("Wrestling", "Swimming","Table Tennis"));

        list.add(s1); list.add(s3); list.add(s5); list.add(s7);
        list.add(s2); list.add(s4); list.add(s6); list.add(s8);

        return list;
    }
}

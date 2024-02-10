package com.learn.basics.lamda;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LambdaPrblmCustomClass {

    public static void main(String[] args) {
        List<DoctorClass> list = GetDoctorObjects.getAllDoctorsObj();

        // print distinct city
        list.stream().map(DoctorClass::getCity).distinct().forEach(System.out::println);

        // total number of Doctors per city
        Map<String,Long> countDoc = list.stream().collect(Collectors.groupingBy(DoctorClass::getCity,Collectors.counting()));
        System.out.println(countDoc);

        // Average of salaries

    }

}

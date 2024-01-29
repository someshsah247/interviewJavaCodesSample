package com.learn.basics.lamda;

import java.util.List;
import java.util.stream.Collectors;

public class GroupByDemo {
    public static void main(String[] args) {

        List<DoctorClass> list = GetDoctorObjects.getAllDoctorsObj();

        list.stream().map(x->x.getCity()=="Bangalore").collect(Collectors.toList());

    }
}

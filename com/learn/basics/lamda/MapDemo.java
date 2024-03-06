package com.learn.basics.lamda;

import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
    public static void main(String[] args) {
        List<DoctorClass> dcList = GetDoctorObjects.getAllDoctorsObj();

        // only chnage in only 1 parameter.
        System.out.println( dcList.stream().map(e->e.getSalary()*0.1).collect(Collectors.toList()));

        // for whole list
        List<DoctorClass> list = dcList.stream()
                .map(dc-> new DoctorClass(
                        dc.getId(),
                        dc.getName(),
                        dc.getCity(),
                        dc.getSalary() * 2,
                        dc.getSpecialist()
                )).toList();

        System.out.println(list);

        // Flat map

    }
}

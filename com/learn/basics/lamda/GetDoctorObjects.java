package com.learn.basics.lamda;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GetDoctorObjects {

    public static List<DoctorClass> getAllDoctorsObj(){
        List<String> l1 = List.of("eyes","noses","neck");
        List<String> l2 = List.of("leg","mouth","hand");
        List<String> l3 = List.of("hair","ear","skin");
        List<String> l4 = List.of("stomach","foot","neck");
        List<String> l5 = List.of("eyes","noses","ears");

        List<DoctorClass> list = List.of(
                new DoctorClass(1,"Ajay","Bangalore",55,l1),
                new DoctorClass(2,"Ajeet","Bangalore",75,l2),
                new DoctorClass(3,"Anjali","UP",55,l3),
                new DoctorClass(4,"Somesh","Bihar",65,l4),
                new DoctorClass(5,"Shalini","Jharkhand",35,l5),

                new DoctorClass(6,"Rohit","Bangalore",30,l1),
                new DoctorClass(7,"Anshu","Bangal",50,l2),
                new DoctorClass(8,"Bharti","Delhi",60,l3),
                new DoctorClass(9,"Rinkesh","Pune",45,l4),
                new DoctorClass(10,"Deepika","Bangalore",16,l5),

                new DoctorClass(25,"Pooja","MP",25,l1),
                new DoctorClass(26,"Roshani","UK",975,l2),
                new DoctorClass(11,"Aashi","Bangalore",585,l3),
                new DoctorClass(12,"Ankur","Bangalore",795,l4),
                new DoctorClass(13,"Lokesh","UP",505,l5),

                new DoctorClass(14,"Yogesh","Bihar",615,l1),
                new DoctorClass(15,"Shanti","Jharkhand",325,l2),
                new DoctorClass(16,"Rohit","Bangalore",330,l3),
                new DoctorClass(17,"Anshu","Bangal",540,l4),
                new DoctorClass(18,"Pakistani","Delhi",650,l5),
                new DoctorClass(19,"Hindustani","Pune",465,new ArrayList<>()),
                new DoctorClass(20,"Satya","karnataka",176,new LinkedList<>())
        );
        return list;
    }
}

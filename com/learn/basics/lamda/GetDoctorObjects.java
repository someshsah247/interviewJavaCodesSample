package com.learn.basics.lamda;

import java.util.List;

public class GetDoctorObjects {

    public static List<DoctorClass> getAllDoctorsObj(){
        List<DoctorClass> list = List.of(
                new DoctorClass(1,"Ajay","Bangalore",55),
                new DoctorClass(2,"Ajeet","Bangalore",75),
                new DoctorClass(3,"Anjali","UP",55),
                new DoctorClass(4,"Somesh","Bihar",65),
                new DoctorClass(5,"Shalini","Jharkhand",35),
                new DoctorClass(6,"Rohit","Bangalore",30),
                new DoctorClass(7,"Anshu","Bangal",50),
                new DoctorClass(8,"Bharti","Delhi",60),
                new DoctorClass(9,"Rinkesh","Pune",45),
                new DoctorClass(10,"Deepika","Bangalore",16),
                new DoctorClass(25,"Pooja","MP",25),
                new DoctorClass(26,"Roshani","UK",975),
                new DoctorClass(11,"Aashi","Bangalore",585),
                new DoctorClass(12,"Ankur","Bangalore",795),
                new DoctorClass(13,"Lokesh","UP",505),
                new DoctorClass(14,"Yogesh","Bihar",615),
                new DoctorClass(15,"Shanti","Jharkhand",325),
                new DoctorClass(16,"Rohit","Bangalore",330),
                new DoctorClass(17,"Anshu","Bangal",540),
                new DoctorClass(18,"Pakistani","Delhi",650),
                new DoctorClass(19,"Hindustani","Pune",465),
                new DoctorClass(20,"Satya","karnataka",176)
        );
        return list;
    }
}

//package com.learn.basics.lamda;
//
//import java.util.List;
//import java.util.Map;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//
//public class GroupByDemo {
//    public static void main(String[] args) {
//
//        List<DoctorClass> list = GetDoctorObjects.getAllDoctorsObj();
//
//        list.stream().map(x->x.getCity()=="Bangalore").collect(Collectors.toList());
//
//        // Using flat map get list of cities
//        List city =list.stream()
//               // .map(DoctorClass::getCity).toList();
//                        .forEach(x->System.out.print(x + " "));
//        // Bangalore Bangalore UP Bihar Jharkhand Bangalore Bangal Delhi Pune Bangalore MP UK Bangalore Bangalore UP Bihar Jharkhand Bangalore Bangal Delhi Pune karnataka
//
//        // group by counting per city
//        Map map = (Map) city.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        map.forEach((x,y) -> System.out.println(x +" "+y));
//    }
//}
//
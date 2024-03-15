package com.learn.basics.interview;

import com.learn.basics.classesfordemo.EmployeeClass;

import java.util.ArrayList;
import java.util.List;

public class SonyIndia {

    private static List<EmployeeClass> getEmpObj(){
        List<EmployeeClass> ecList = new ArrayList<>();
        EmployeeClass ec1 = new EmployeeClass (1,"somesh",12L);
        EmployeeClass ec2 = new EmployeeClass (2,"shalini",15L);
        ecList.add(ec1); ecList.add(ec2);
        return ecList;
    }
    public static void main(String[] args) {
        //similar question
        List<EmployeeClass> newList =
                getEmpObj().stream().map((x)-> new EmployeeClass(x.getEmpId(),x.getName(),(x.getSalary() * 2))).toList();
        System.out.println(newList);
    }

}

    /*
    list -- from db - products

    Procuct{
        name   mobile -- 2000 * 2
        price
    }

    List<product> prodList = new ArrayList<>();
    List<Procuct> newList = prodList.stream().map((x)-> new Product(x.getName,(x.getPrice * 2))).toList();
     */

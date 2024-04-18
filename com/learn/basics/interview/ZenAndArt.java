package com.learn.basics.interview;

import com.learn.basics.classesfordemo.StudentClass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ZenAndArt {

    public static void main(String[] args) {
        List<StudentClass> list = new ArrayList<>();
        // consider gender means 2 departmains
        //list.stream().collect(Collectors.groupingBy(x->x.getGender(), ))
    }
}

/*

// immutable class
class Emp {

    private String name;
    private Integer age;
    private List<String> mobileNumberList;
    private List<String> copyMobileNumberList;

    // getter Methods
    public String getName(){
        return this.name;
    }

    public Integer getAge(){
        return this.age;
    }
    public List<String> getMobileNumberList(){
        return this.mobileNumberList;
    }

    public Emp(String name , Integer age , List<String> list){
        this.name =name;
        this.age = age;
        this.copyMobileNumberList = list;
        mobileNumberList = copyMobileNumberList.stream().toList();
    }
}

// Emp object -- for each department (like HR, IT ) --
// 1 ) average salary
// 2 ) highest salary

list.stream().collect(Collect.groupingBy(x->x.getDepartment(),))

 */

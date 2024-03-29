package com.learn.basics.interview;

import com.learn.basics.classesfordemo.EmployeeClass;

import java.util.ArrayList;
import java.util.List;

public class Sopra {
    public static void main(String[] args) {
        //System.out.println("Working");
        List<EmployeeClass>  list = new ArrayList<>();
        list.add(new EmployeeClass(1,"somesh", 78000L));
        list.add(new EmployeeClass(2,"lokesh", 58000L));
        list.add(new EmployeeClass(3,"yogesh", 48000L));
        list.add(new EmployeeClass(1,"raja", 98000L));
        list.add(new EmployeeClass(2,"ramesh", 58000L));
        list.add(new EmployeeClass(3,"anshu", 37000L));
        list.add(new EmployeeClass(1,"priya", 68000L));
        list.add(new EmployeeClass(2,"suraj", 29000L));
        list.add(new EmployeeClass(3,"bharti", 50000L));

        List<EmployeeClass>  newList = list.stream().filter(x->x.getSalary()>52000L).map(x->new EmployeeClass(x.getEmpId(), x.getName(), x.getSalary())).toList();
        System.out.println(newList);
    }
}

/*
list of emp {id, salary} > 50K

List list = new List();
e1 = new Emp(1,34000);

List newList = list.stream().filter(x -> x.getSalary() > 50000)
.sorted((x,y)-> x.getid() - y.getId())
.distinct()
.skip(1)
.limit(2)
.toList();

SOP(newList);

List newList = list.stream().map(x-> new Emp()



class EmpTest{

private Emp getEmpObject(){
retune new Emp(1,50000);
}

@Mock

@InjectMock


@Test
public void getmethodTest(){
Assert.notNull(getEmpObject);
}

@Test
public void getmethodTest(){
Emp e = getEmpObject();
e.setSalary(4500);
Assert.equals(e.getSalay,4500);
}

}

 */
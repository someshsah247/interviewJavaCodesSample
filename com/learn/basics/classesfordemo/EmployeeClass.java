package com.learn.basics.classesfordemo;


import lombok.*;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeClass {

    private int empId;
    private String name;
    private double salary;

}

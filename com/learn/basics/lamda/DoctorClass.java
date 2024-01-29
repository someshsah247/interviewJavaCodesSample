package com.learn.basics.lamda;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@ToString
public class DoctorClass {
    private int id;
    private String name;
    private String city;
    private int salary;
}

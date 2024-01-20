package com.learn.basics.comparablecode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableInClass  {
    
    public static void main(String[] args) {
        
        List<Teacher> listTech = new ArrayList<>();
        listTech.add(new Teacher(6, "somesh"));
        listTech.add(new Teacher(2, "rajat"));
        listTech.add(new Teacher(2, "rohit"));
        listTech.add(new Teacher(4, "shalini"));
        listTech.add(new Teacher(3, "raju"));
        listTech.add(new Teacher(6, "suraj"));
        listTech.add(new Teacher(1, "Ramesh"));

        Collections.sort(listTech);
        System.out.println(listTech);
    }
}

package com.learn.basics.comparatorcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorInClass {

    public static void main(String[] args) {

        List<PoliceClass> listPc = new ArrayList<>();
        listPc.add(new PoliceClass(1,"somesh"));
        listPc.add(new PoliceClass(89,"lokesh"));
        listPc.add(new PoliceClass(23,"yogesh"));
        listPc.add(new PoliceClass(56,"raja"));
        listPc.add(new PoliceClass(12,"maza"));
        listPc.add(new PoliceClass(97,"orang"));
        listPc.add(new PoliceClass(19,"apple"));
        listPc.add(new PoliceClass(71,"sai"));
        listPc.add(new PoliceClass(91,"pari"));

        Collections.sort(listPc,new PoliceIdClass());

        System.out.println(listPc);







    }
}

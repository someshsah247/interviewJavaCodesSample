package com.learn.basics.comparatorcode;

import java.util.Comparator;

public class PoliceIdClass implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
       // return ((PoliceClass)o2).getId() - ((PoliceClass)o1).getId(); // descending
        return ((PoliceClass)o1).getId() - ((PoliceClass)o2).getId();
    }
}

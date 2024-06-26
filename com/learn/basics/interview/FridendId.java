package com.learn.basics.interview;

import java.util.Comparator;

public class FridendId implements Comparator<Friend> {
// here sort data based on id , if id is same then sort based on name.
    @Override
    public int compare(Friend o1, Friend o2) {
        int idComparision = Integer.compare(o1.getId(),o2.getId());
            if(idComparision == 0){
                return (o1.getName().compareTo(o2.getName()));
            }
        return idComparision;
    }
}

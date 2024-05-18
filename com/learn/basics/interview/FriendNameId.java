package com.learn.basics.interview;

import java.util.Comparator;

public class FriendNameId implements Comparator<Friend> {

    @Override
    public int compare(Friend o1, Friend o2) {
        int nameComp =  o1.getName().compareTo(o2.getName());
        if(nameComp == 0){
            return o1.getId() - o2.getId();
        }
        return nameComp;
    }
}

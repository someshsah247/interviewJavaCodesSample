package com.learn.basics.stringsss;

import java.util.StringJoiner;

public class StringJoinnerEg {

    public static void main(String[] args) {

        // constructor only takes delimiter
        StringJoiner sj1 = new StringJoiner("#");
        sj1.add("Somesh");
        sj1.add("sah");
        sj1.add("Rajat");
        sj1.add("Jha");
        System.out.println(sj1); // Somesh#sah#Rajat#Jha

        // constructor takes 3 --  delimiter , prefix , suffix
        StringJoiner sj2 = new StringJoiner(",", "start -> "," <- end.");
        sj2.add("Somesh");
        sj2.add("Rahul");
        sj2.add("Rajat");
        sj2.add("Shalini");
        System.out.println(sj2); // start -> Somesh,Rahul,Rajat,Shalini <- end.

    }

}

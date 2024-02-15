package com.learn.basics.stringsss;

public class StringImmutable {

    public static void main(String[] args) {

        String s1 = "somesh";
        System.out.println(s1.hashCode());
        s1 = s1 + "sah";
        System.out.println(s1.hashCode());

    }


}

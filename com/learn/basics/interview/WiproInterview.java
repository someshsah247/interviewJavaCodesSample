package com.learn.basics.interview;

public class WiproInterview {

    public static void someMethod(Object o) {
        System.out.println("Object method Invoked");
    }
    public static void someMethod(String s) {
        System.out.println("String method Invoked");
    }

    public static void main(String[] args) {

        // Question 1
        String s1 = "Somesh"; // constant pool
        String s2 = new String("Somesh"); // heap
        String s3 = new String("Somesh").intern(); // constant pool


        System.out.println(s1==s2); // false
        System.out.println(s2==s3); // false
        System.out.println(s1==s3); // true

        // Question 2
        // Which one called
        someMethod(null);
    }

}


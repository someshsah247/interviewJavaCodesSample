package com.learn.basics;

public class a {

        public static void test(String s)
        {
            System.out.println("In String");
        }
        public static void test(Object o) {
            System.out.println("In Object");
        }

        public static void main(String args[]) {
            test(null);
        }

}

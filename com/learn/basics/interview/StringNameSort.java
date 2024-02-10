package com.learn.basics.interview;

import java.util.Arrays;
// https://www.geeksforgeeks.org/java-program-to-sort-names-in-an-alphabetical-order/
 //  CitiusTech Company asked.
public class StringNameSort {


    public static void main(String[] args) {
        String[] s = new String[] { "yash","Sahil","Sagar","Akhil","Suraj","Swapneel","rajat", "rohit" };
        sortUsingMethod(s);
        sortUsingLogic(s);
    }

    private static void sortUsingLogic(String[] names) {

    }

    private static void sortUsingMethod(String[] names) {
        for (int i = 0; i < names.length; i++) {
            Arrays.sort(names);
        }
        Arrays.stream(names).forEach(x -> System.out.print(x + " "));
    }

}

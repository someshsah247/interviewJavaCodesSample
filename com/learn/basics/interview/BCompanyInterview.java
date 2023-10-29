package com.learn.basics.interview;


import java.util.Arrays;

// TransUnion
public class BCompanyInterview {

    public static void main(String[] args) {
        // Array
        int[] intArray = new int[]{0,1,2,3,5,6,7,9,10,24,40};

        //Using given array, print the list of all elements having cube more than 75.

        // Output(Cubes) -- [125, 216, 343, 729, 1000, 13824, 64000]
        System.out.println(
                Arrays.toString(Arrays.stream(intArray)
                        .map(x -> x * x * x)
                        .filter(x -> x > 75)
                        .toArray())
        );

        // Output(original Array) -- [5, 6, 7, 9, 10, 24, 40]
        System.out.println(
                Arrays.toString(Arrays.stream(intArray)
                        //.map(x -> x * x * x)
                        .filter(x -> x * x * x > 75)
                        .toArray())
        );

    }


}

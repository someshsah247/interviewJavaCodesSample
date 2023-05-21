package com.learn.basics.strems;

import java.util.Arrays;
import java.util.List;

//Ques - Multiply of each element and give one result
// Ques -- Multiply each stream element with 5;

public class ReduceClass {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,3,5,7,9);

        System.out.println( "Multiply of each element and give one result " +
                list.stream()
                        .reduce(1,(a,b)->a*b)
        );

        System.out.println( "Multiply each stream element with 5 and give results " +
                list.stream()
                        .map((a)->a*5)
                        .toList()
        );
    } // main() end
} // class end

//working of  .reduce(1,(a,b)->a*b)
/*
Step 1 -- a=1 (it is taking from reduce 1st parameter) ,b=2 (from stream 1st value)
Step 2 -- a= a*b , and b=3 (from stream 2nd number)
Step 3 -- a= a*b , and b=5 (from stream 3rd number)
Step 4 -- a= a*b , and b=7 (from stream 4th number)
Step 5 -- a= a*b , and b=9 (from stream 5th number)
Strp 6 -- multiply all and return result.
 */
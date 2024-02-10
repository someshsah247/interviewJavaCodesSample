package com.learn.basics.logicalbasics;

public class SwappingNumber {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

/*
        //way 1 using 3rd variable
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        System.out.println("1 -- "+"a--> "+a +" :: "+"b--> "+b);
*/
/*
        //way 2 -- without using 2 variable.
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("2 -- "+"a--> "+a +" :: "+"b--> "+b);
*/
        //way 3 -- logical operator -- bit wise -- XOR
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("3 -- "+"a--> "+a +" :: "+"b--> "+b);

    }
}

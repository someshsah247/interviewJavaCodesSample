package com.learn.basics.recursion;

public class FactorialCode {

    static int getFactorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * getFactorial(n-1));
    }

    public static void main(String[] args) {
        int value = 5;
        int fact = 1;

        //recursion
        System.out.println("Factorial -> "+ getFactorial(5));

// Basic
//        for (int i = value; i > 1 ; i--) {
//            fact*=i;
//        }
//        System.out.println("Factorial -> "+fact);

    }

}

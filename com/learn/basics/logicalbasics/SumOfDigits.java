package com.learn.basics.logicalbasics;

public class SumOfDigits {

    public static void main(String[] args) {
        int number = 123456789;
        int sum =0;

        while(number>0){
            sum+= number%10; // take last digit and add
            number = number /10; // remove last digit
        }
        System.out.println(sum);
    }

}

package com.learn.basics.logicalbasics;

public class CountNumberOfDigits {

    public static void main(String[] args) {

        int number = 2345678;
        int count = 0;

        while (number>0){
            number = number / 10; // remove the last digit
            count++;
        }

        System.out.println(count);
    }
}

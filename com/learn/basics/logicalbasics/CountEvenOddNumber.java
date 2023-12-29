package com.learn.basics.logicalbasics;

public class CountEvenOddNumber {
    public static void main(String[] args) {

        int number = 2345678;
        int oddCount = 0;
        int evenCount = 0;

        while (number>0){

            int remender = number%10; // get last digit

            if(remender%2==0){ // check it is even or not
                evenCount++;
            }else {
                oddCount++;
            }

            number = number / 10; // eliminate last digit

        }

        System.out.println("oddCount--> "+oddCount);
        System.out.println("evenCount--> "+evenCount);

    }
}

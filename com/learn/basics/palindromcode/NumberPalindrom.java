package com.learn.basics.palindromcode;

// It is not working ... so logic issue is there.

public class NumberPalindrom {

    private static void isPalindromNumber(int originalNumber) {
        int temp  = originalNumber ;
        int reminder = 0 ;
        int sum = 1;

        while (originalNumber>0){
            reminder = temp % 10 ; // generate reminder
            sum = (sum * 10) + reminder;
            originalNumber = originalNumber/10;
        }

        if(sum == temp)
            System.out.println("number palindrom");
        else
            System.out.println("not palindrom");
    }
    public static void main(String[] args) {
        isPalindromNumber(123);
        isPalindromNumber(12321);
        isPalindromNumber(123321);
        isPalindromNumber(123456);
    }


}

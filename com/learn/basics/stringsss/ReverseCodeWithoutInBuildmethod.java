package com.learn.basics.stringsss;

// WAP to reverse given string without using in build method

public class ReverseCodeWithoutInBuildmethod {

    public static void stringReverse(String original){
        String reverseWord = "";
        for (int i = original.length()-1; i >=0; i--) {
            reverseWord = reverseWord + original.charAt(i);
        }
        System.out.println(reverseWord);
    }

    public static void main(String[] args) {
        stringReverse("Somesh Sah");
    }

}

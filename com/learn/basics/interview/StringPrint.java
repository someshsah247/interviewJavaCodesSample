package com.learn.basics.interview;

public class StringPrint {

    public static void main(String[] args) {

        String first = "abcd";
        String second = "efgh";

        //output --> aebfcgdh

        for (int i=0 ; i<second.length(); i++ ){
            System.out.print(first.charAt(i)+""+second.charAt(i));
        }

    }
}

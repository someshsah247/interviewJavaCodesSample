package com.learn.basics.interview;

public class StringPrint {

    // PWD

    public static void main(String[] args) {

        String first = "abcd";
        String second = "efgh";

        //output --> aebfcgdh

        for (int i=0 ; i<second.length(); i++ ){
            System.out.print(first.charAt(i));
            System.out.print(second.charAt(i));
            //System.out.print(first.charAt(i)+1);
            //System.out.print(first.charAt(i)+""+second.charAt(i));
//            System.out.println(1+2+3+"Hello"); // 6Hello
//            System.out.println("Hello"+1+2+3); //Hello123
        }

    }
}

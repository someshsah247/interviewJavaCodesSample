package com.learn.basics.trickyques;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LogicalCode {

    private static void stringSum(String a, String b) throws Exception{
//        try {
//            int num1 = Integer.parseInt(a);
//            int num2 = Integer.parseInt(b);
//            System.out.println("Sum - "+ (num1+num2));
//        }catch (Exception e){
//            System.out.println("Exception");
//        }

        BigInteger bg1 = new BigInteger(a);
        BigInteger bg2 = new BigInteger(b);
        System.out.println(bg1.add(bg2));
    }

    private static void convertBinaryToDecimal(String binaryVal){
        binaryVal = new StringBuilder(binaryVal).reverse().toString();
        int len = binaryVal.length();
        Double totalVal = 0.0;

        for (int i = 0; i <len; i++) {
            if(binaryVal.charAt(i) == '1')
                totalVal += Math.pow(2,i);
        }
        System.out.println(totalVal.intValue());
    }

    private static void listOfOperations(String[] arr,int initialVal){
//        set of operations = ["X++","++X","--X","X--", "X++"]
//        initial value = 5
//        final result ?
        //String new
        for (int i = 0; i < arr.length ; i++) {
//            if(arr[i].contains("+")){
//                initialVal++;
//            }else
//                initialVal--;
            initialVal = arr[i].contains("+") ? initialVal+1 : initialVal-1;
        }
        System.out.println(initialVal);
    }


    private static void containsAllAlphabets(String sentence){
        Set<Character> s = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
//            if( !(s.contains(sentence.charAt(i))) // because iske ander bhi 1 loop hai.
//                   // (sentence.charAt(i) >= 'a' || sentence.charAt(i) <= 'z') &&
//                    //(sentence.charAt(i) >= 'A' || sentence.charAt(i) <= 'Z') &&
//                   // (sentence.charAt(' ') != ' ' )
//            ){
                s.add(sentence.charAt(i));
           // }
        }
        System.out.println( (s.size()==26 && !s.isEmpty()) ? true : false );

        // space --> order of n
        // time --> n^2 worst -- best nlogn
    }





    public static void main(String[] args) throws Exception {
        //stringSum("131","12345");

//        convertBinaryToDecimal("1000");
//        convertBinaryToDecimal("101");

//        String[] arr = new String[]{"X++","++X","--X","X--", "X++"};
//        listOfOperations(arr,5);

        //    Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
//    Output: true
//    Explanation: sentence contains at least one of every letter of the English alphabet.
//    Example 2:
//
//    Input: sentence = "leetcode"
//    Output: false
        //containsAllAlphabets("thequickbrownfoxjumpsoverthelazydog");
        //containsAllAlphabets("leetcode");



    }

}

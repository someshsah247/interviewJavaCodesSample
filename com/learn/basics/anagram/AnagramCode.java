package com.learn.basics.anagram;

import java.util.Arrays;

// https://www.javainterviewpoint.com/anagram-program-in-java/

public class AnagramCode {

    private static void isAnagramOneWay(String original1, String original2){

        int[] word1 = new int[26];
        int[] word2 = new int[26];

        Arrays.fill(word1, 0); // used to inisilize entire array values
        Arrays.fill(word2, 0);

        if(original1.length() != original2.length() ){
            System.out.println("NOT ANAGRAM");
        }
        else{
            for(int i = 0 ; i<original1.length() ; i++){
                word1[original1.charAt(i)-97]++ ;
                word2[original2.charAt(i)-97]++ ;
            }

            for(int i = 0 ; i<26 ; i++){
                if(word1[i] !=word2[i]){
                    System.out.println("NOT ANAGRAM");
                    break;
                }
                if(i==25)
                    System.out.println("ANAGRAM");
            }
        }
    }

    //Interviewer may told -- dont use inbuilt functions
    private static void isAnagramOneTwo(String original1, String original2){
        // convert strings to char array
        char[] w1 = original1.toCharArray();
        char[] w2 = original2.toCharArray();

        if(w1.length == w2.length){
            // sort the char array
            Arrays.sort(w1);
            Arrays.sort(w2);

            if(Arrays.equals(w1,w2)){
                System.out.println("ANAGRAM");
            }else{
                System.out.println("NOT ANAGRAM");
            }
        }else{
            System.out.println("NOT ANAGRAM");
        }
    }

    public static void main(String[] args) {

    }
}

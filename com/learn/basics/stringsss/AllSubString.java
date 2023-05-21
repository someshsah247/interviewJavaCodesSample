package com.learn.basics.stringsss;

//If input is “abb”  then output should be “a”, “b”,”b”, “ab”, “bb”, “abb”
public class AllSubString {

    public static void main(String[] args) {

        String s = "abb";

        for (int i = 0 ; i<=s.length() ; i++){
            for (int j =i+1 ; j<=s.length() ; j++)
                System.out.println(s.substring(i,j));
        }

    }

}

package com.codewithrohan.dayfive;

import java.util.Arrays;
// https://leetcode.com/problems/valid-anagram/
// 242. Valid Anagram

public class ValidAnagram {

    public static void main(String[] args) {
        String s ="cat";
        String t = "tar";

        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {
//
//        String ss[] = s.split("");
//        String tt[] = t.split("");
//
//        Array.sort(ss);
//
//        if(ss.length != tt.length){
//            return false;
//        } else {
//            for (int i = 0, j = 0; i <ss.length ; i++) {
//                if(ss[i] != tt[i]){
//                    return false;
//                }
//            }
//        }
        return true;
    }
}

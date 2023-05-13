package com.learn.basics.collectionsss;

import java.util.HashMap;
import java.util.Map;

// the task is to write a program in Java which prints the number of occurrences of each character in a string.
// https://www.geeksforgeeks.org/java-program-to-count-the-occurrence-of-each-character-in-a-string-using-hashmap/

public class OccurrenceOfCharInString {

    public static void main(String[] args) {

        String original = "somesh";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i =0 ; i<= original.length()-1 ; i++ ){
            if(!map.containsKey(original.charAt(i))) {
                map.put(original.charAt(i), 1);
            }else{
                map.put(original.charAt(i), map.get(original.charAt(i)) +1  );
            }
        }

        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}

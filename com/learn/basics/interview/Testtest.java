package com.learn.basics.interview;

import java.util.Arrays;
import java.util.HashMap;

public class Testtest {
    //capco
    public static void main(String[] args) {
        /*
Given a dictionary of the words(strings) which contains different words & you are given an input string e.g. “abd”. You need to find the largest word available in the supplied dictionary which can be made using the letters of input string. The returned word can contain only the same no of occurrences of the letters as given in the input string i.e. if a letter is given once then in the output it should be existed only once. Examples:
Input Dictionary : {"to", "banana", "toe", "toes", "dogs", "ababcd", "elephant"} and input string is "ogtdes".
Output : [toes, dogs]
         */
        int count = 1;
        String input = "ogtdes"; //6
        String[] inputChar = input.split("");
        String[] words = new String[]{"to", "banana", "toe", "toes", "dogs", "ababcd", "elephant"}; // arrtList
        HashMap<Character,Integer> map  = new HashMap<>();
        for (int i = 0; i <inputChar.length ; i++) { //0-6
            map.put(inputChar[i].charAt(0), 1);
        }

        String[] resultArr = new String[words.length];
        String result = "";
        for (int i = 0; i <words.length ; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if(map.containsKey(words[i].charAt(j))){
                    result+= words[i].charAt(j);
            }
                //System.out.print(result + ",");

                resultArr[i] = result;
                result = "";
        }
            for (int j = 0; j < resultArr.length; j++) {
                System.out.print(resultArr[i] + " ");
            }

        }

        }


}

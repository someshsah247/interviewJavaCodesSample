package com.leetcode.dec24;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Day2 {
    // 1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence
//    public int isPrefixOfWord(String sentence, String searchWord) {
//        String listOfWord[] = sentence.split(" ");
//        int maxMactch = 0;
//        int index=0;
//        for (int i = 0; i < listOfWord.length; i++) {
//            int currentCount = 0;
//            for (int j = 0; j < searchWord.length() && j<listOfWord[i].length(); j++) {
//                if(searchWord.charAt(j) == listOfWord[i].charAt(j)){
//                    currentCount++;
//                    if(maxMactch<currentCount){
//                        maxMactch++;
//                        index = i;
//                    }
//                }
//            }
//        }
//        if(maxMactch>0)
//            return index+1;
//        else
//            return -1;
//    }

    public int isPrefixOfWord(String sentence, String searchWord) {
        String listOfWord[] = sentence.split(" ");
        // Arrays.sort(listOfWord);
        int max =-1;
        for (int i = 0; i < listOfWord.length; i++) {
            if(listOfWord[i].length()>=searchWord.length()){
                for (int j = 0; j < searchWord.length(); j++) {
                    if (j == searchWord.length() - 1) {
                        if (searchWord.charAt(j) == listOfWord[i].charAt(j)) {
                            max = i + 1;
                            break;
                        }
                    } else if (searchWord.charAt(j) != listOfWord[i].charAt(j)) {
                        break;
                    }
                }
            }
            if(max>-1)
                return max;
        }
        return  max;
    }

/*
 String[] s = sentence.split(" ");
    int index = Arrays.stream(s)
            .filter (st->st.startsWith(searchWord))
            .mapToInt(st ->Arrays.asList(s).indexOf(st))
            .findFirst().orElse(-1);
        return index==-1?-1:index+1;
 */


    public static void main(String[] args) {
        Day2 d = new Day2();
//        String sentence = "i love eating burger"; // burg
//        String word = "burg";
//        String sentence = "this problem is an easy problem";
//        String word = "pro";
//        String sentence = "hello from the other side";
//        String word = "they";
        String sentence = "hellohello hellohellohello";
        String word = "ell";
        System.out.println(d.isPrefixOfWord(sentence,word));
    }
}

package com.codewithrohan.daythree;

// https://leetcode.com/problems/truncate-sentence/submissions/1725926885/
public class TruncateSentence {

    // Slow
    public String truncateSentence(String s, int k) {
        String strArray[] = s.split(" ");
        String returnStr = "";
        for(int i=0 ; i<=k-1 ; i++){
            returnStr += strArray[i] +" ";
        }
        return returnStr.trim();
    }

    // fast
    public String truncateSentenceTwo(String s, int k) {
        String strArray[] = s.split(" ");
        StringBuilder returnStr = new StringBuilder();
        for(int i=0 ; i<=k-1 ; i++){
            returnStr.append(strArray[i]).append(" ");
        }
        return returnStr.toString().trim();
    }

    public static void main(String[] args) {

    }
}

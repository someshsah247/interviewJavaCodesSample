package com.learn.basics.stringsss;

public class ReplaceCharInString {

    // replace a given chareter from the given string
    public static void main(String[] args) {
        String s = "somesh sah";
        String output = ""; // we can use string buffer and builder

        // System.out.println(s.replaceAll("s","")); // Done

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != 's'){
                output += s.charAt(i);
            }
        }

        System.out.println(output); // omeh ah

    }


}

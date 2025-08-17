package com.leetcode.dec24;

public class Day3 {

    public boolean canMakeSubsequence(String str1, String str2) {
        int str2Index = 0;
        int str2Length = str2.length();

        // Iterate through each character in string 1
        for (char currentChar : str1.toCharArray()) {
            // Get the next character in alphabetical order
            char nextChar = (currentChar == 'z') ? 'a' : (char) (currentChar + 1);

            // Check if there's still a character left in str2 to match.
            if (str2Index < str2Length) {
                char str2Char = str2.charAt(str2Index);
                // Match either the current character or the next character.
                if (str2Char == currentChar || str2Char == nextChar) {
                    str2Index++; // Move to the next character
                }
            }
        }
        // Check if we have successfully traversed all characters.
        return str2Index == str2Length;
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ad";
        Day3  d = new Day3();
        System.out.println(d.canMakeSubsequence(s1,s2));
    }
}

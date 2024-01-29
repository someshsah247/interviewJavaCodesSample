package com.learn.basics.groupcode.somesh.strings;

import java.util.Arrays;

// https://leetcode.com/problems/longest-common-prefix/description/
public class LongestCommonPrefix {
        public static String longestCommonPrefix(String[] v) {
            StringBuilder ans = new StringBuilder();
            Arrays.sort(v); // this is twist.
            String first = v[0];
            String last = v[v.length-1];
            for (int i=0; i<Math.min(first.length(), last.length()); i++) {
                if (first.charAt(i) != last.charAt(i)) {
                    return ans.toString();
                }
                ans.append(first.charAt(i));
            }
            return ans.toString();
        }

    public static void main(String[] args) {
            String[] str = new String[]{"flower","flow","flight"};
            System.out.println(longestCommonPrefix(str));
    }

}

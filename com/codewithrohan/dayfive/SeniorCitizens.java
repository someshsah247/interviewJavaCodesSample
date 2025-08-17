package com.codewithrohan.dayfive;

// https://leetcode.com/problems/number-of-senior-citizens/description/
/// 2678. Number of Senior Citizens

public class SeniorCitizens {

    public static void main(String[] args) {
        String details[] = new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(countSeniors(details));
    }
    public static int countSeniors(String[] details) {
        int count =0;
        for (int i = 0; i < details.length; i++) {
            // System.out.println(details[i].substring(11,13));
            if( Integer.parseInt(details[i].substring(11,13)) > 60){
                count++;
            }
        }
        return count;
    }
}

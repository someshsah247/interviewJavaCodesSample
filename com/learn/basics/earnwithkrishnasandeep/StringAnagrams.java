package com.learn.basics.earnwithkrishnasandeep;

// https://www.youtube.com/watch?v=0g80Medlldc&list=PLF9tovyahfL2pF-DWH7WQyuN_Cmz64DTT&ab_channel=LearnWithKrishnaSandeep

public class StringAnagrams {

    public static void main(String[] args) {
        String str1 ="somesh";
        String str2 ="hssmeo";

        System.out.println(isAnagrams(str1,str2));

    }

    private static boolean isAnagrams(String str1, String str2) {
        if(str1.length()!=str2.length()){
            return false;
        }else {
            int countArr[] = new int[255]; // create 1 array. Its default value is 0.

            //for loop
            for (int i = 0; i < str2.length(); i++) {
                countArr[str1.charAt(i)]++; // 1st string array me jo b element ho uske position me ja ke +1 kr do.
                countArr[str2.charAt(i)]--; // 2nd string array me jo b elemnet ho uske position me ja ke -1 kr do.
            }

            //just to verify -- if still all elements is 0 means it is anagram.
            for (int i = 0; i < str2.length(); i++) {
                if(countArr[i]!=0)
                    return false;
            }

        }
        return true;
    }


}

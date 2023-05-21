package com.learn.basics.stringsss;

// (Input) ABCD -- > CDAB (output) -- true
// ABCDABCD add input string twice --
// if resulting contains output it means it is Rotaional Scree.
public class StringRotaionCode {
    public static void main(String[] args) {
        String s = "ABCD";
        String t = "CDAB";
        //adding twice
        String newString = s+s;
        //now check
        if(newString.contains(t))
            System.out.println("true -- Rotaional");
        else
            System.out.println("flase -- NOT Rotaional");




    }
}

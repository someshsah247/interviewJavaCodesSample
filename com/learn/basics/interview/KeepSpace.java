package com.learn.basics.interview;

// Asked me in some interview

// Input --  Hi my name is somesh.
// Output -- hs em ossi em anymiH.
// space constant rahe ga but pure characters reverse ho jaye ga.

// NEED TO COMPLETE

public class KeepSpace {

    public static void main(String[] args) {

        String line = "Hi my name is somesh.";

        char[] charArr = new char[line.length()];
        char[] spaceArr = new char[line.length()];

        for (int i = 0; i < line.length(); i++) {
            if(line.charAt(i) == ' '){
                spaceArr[i]=' '; // store only space
            }else {
                charArr[i]=line.charAt(i); // all characters
            }
        }

        for (int i = charArr.length; i > 0; i--) {
            if(spaceArr[i]==' '){
                continue;
            }else {
                //spaceArr[i]=
            }
        }


    }

}

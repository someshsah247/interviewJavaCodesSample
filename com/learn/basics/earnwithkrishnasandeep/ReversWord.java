package com.learn.basics.earnwithkrishnasandeep;

// input -- I Love My India
// output -- India My Love I
// https://www.youtube.com/watch?v=k_D4pCkiqOc&list=PLF9tovyahfL2pF-DWH7WQyuN_Cmz64DTT&index=5&ab_channel=LearnWithKrishnaSandeep

public class ReversWord {

    public static void main(String[] args) {
        String s = "I Love My India";
        String[] strArry = s.split(" ");

        for (int i = strArry.length-1; i >= 0 ; i--) { // run for loop ulta
            System.out.print(strArry[i] + " ");
        }

    }

}


package com.learn.basics.interview;

public class EyL2 {
    public static void main(String[] args) {
         /*
        Java program to square sorted array of +ve and -ve numvers.
        given an array: -6, -1,2,4,5,7
        after square: 36,1,4,16,25,49
        output: 1,4,16,25,36,49
        */

        int[] arr = new int[]{-6, -1,2,4,5,7};
        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length ; i++) {
            newArr[i] = arr[i] * arr[i];
        }

        // sorting
        for (int i = 0; i <newArr.length ; i++) {
            for (int j = i+1; j <newArr.length ; j++) {
                if(newArr[i]>newArr[j]){  // 36, 1
                    int temp = newArr[i]; //36
                     newArr[i] = newArr[j];
                    newArr[j] = temp;
                }
            }
        }

        for (int i = 0; i <newArr.length ; i++) {
            System.out.print(newArr[i]+ " ");
        }




        //  =========================================================
     /*
        Reverse each word of a string using java 8 streams ?
        "Java Concept Of The Day"
        avaJ tpecnoC fO ehT yaD
        */

        String sent = "Java Concept Of The Day";
        String[] words = sent.split(" ");

        for(int i=0; i<words.length; i++){
            for(int j=words[i].length()-1 ; j>=0 ; j--){
                System.out.print(words[i].charAt(j));
            }
            System.out.print(" ");
        }


    }

}

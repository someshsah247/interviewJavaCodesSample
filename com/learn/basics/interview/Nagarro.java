package com.learn.basics.interview;


public class Nagarro {
// no coding question asked.
    public static void main(String[] args) {
            // aabc  --> cbaa , abac
/*
        String s1 = "aabc";
        String s2 = "cbaa";

       String ss1 =  Arrays.stream(s1.split("")).sorted().reduce("",(a,b)->a+b).toString();
       String ss2 =  Arrays.stream(s2.split("")).sorted().reduce("",(a,b)->a+b).toString();

        if(ss1.equals(ss2))
            System.out.println("A");
        else
            System.out.println("NA");


 */
        //BiFunction<String,String,Boolean>

        // two sum problem
        int totalsum = 3;
        boolean end =false;
        int[] arr1 = new int[]{1,-2,1,0,5};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 1; j < arr1.length; j++) {
                int count = arr1[i] + arr1[j];
                if (count == totalsum) {
                    System.out.println(i + " " + j);
                    //System.exit(1);
                    end =true;
                    break;
                }
            }
            if(end){
                break;
            }
        }


        // 5,0,7,6,5,3,0,5,3,0,1,0,,0,1,2,4,6,7,9,0,,5,3,0
        // 5,7,6,35,3,1,2,4,6,7,8,9,5,3,0,0,0,0,0,0,0,0




    } // main






}

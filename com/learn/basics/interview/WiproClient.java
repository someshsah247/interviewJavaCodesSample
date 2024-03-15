package com.learn.basics.interview;

// Remove duplicate elements from sorted Array in place. [do not use collections and sorting]
//Input: arr[] = {2, 2, 2, 2, 2}
//Output: arr[] = {2, 0, 0, 0}
//Input: arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5}
//Output: arr[] = { 1, 2, 3, 4, 5, 0, 0, 0, 0}
public class WiproClient {

//    Input: s = “geeks quiz practice code”
//    Output: s = “code practice quiz geeks”
//    Input: s = “i love programming very much”
//    Output: s = “much very programming love i”

    private static String  reverString(String s){
        StringBuilder sb = new StringBuilder();

        if((null != s ) && s.split(" ").length >1){
            String[] sarr = s.split(" ");
           // String newWord = "";
            for (int i = sarr.length-1; i >= 0 ; i--) {
                //newWord =  sarr[i] + " ";
                sb.append(sarr[i]).append(" ");
            }
            return sb.toString();
        }
        return s;
    }

    // Duplicate wala
    //Input: arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5}
    //Output: arr[] = { 1, 2, 3, 4, 5,0, 0, 0, 0}

    private static void dublicateChageZero(int arr){

    }


    public static void main(String[] args) {

        String s = "geeks quiz practice code";

        System.out.println( reverString(s));


    }

}


/*
  public static void main(String[] args) {
        //System.out.println("working");

        int[] arr = new int[]{1, 2, 2, 3, 4, 4, 4, 5, 5};
        int element = arr[0];
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==element){
                arr[arr.length-1]=0;
            }
            else if(arr[i]!=element){
                element = arr[i];
            }
        }

        //Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i]+ " ");
        }





 */
package com.learn.basics.interview;

public class Genpact {
    public static void main(String[] args) {
        //int[] arr = new int[] {2,3,-1,8,4};
        int[] arr = new int[] {-7,1,5,2,-4,3,0};

        int lsum = 0;
        int rsum = 0;

        for(int i=0 ; i<arr.length ; i++){

            //for lsum
            for(int j=0; j<i ; j++){
                lsum += arr[j];
            }

            //for rsum
            for(int k=arr.length-1; k>i ; k--){
                rsum += arr[k];
            }

            if(lsum == rsum){
                System.out.println ("index --> "+ i);
            }else{
                lsum = 0;
                rsum = 0;
            }

        }
    }
}

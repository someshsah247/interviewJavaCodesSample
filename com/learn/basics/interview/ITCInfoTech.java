package com.learn.basics.interview;

public class ITCInfoTech {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,2,3};
        // output -- 1,2,3,4 -- only want unique elements
        // not using java 8 , collections , no sorting
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    count++;
            }
            if(count==1){
                System.out.print(arr[i]+ " ");
            }
            count = 0;
        }
    }
}

// also asked 2nd highesr salary in sql

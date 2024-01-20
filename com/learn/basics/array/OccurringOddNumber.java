package com.learn.basics.array;

import java.util.HashMap;

public class OccurringOddNumber {

    public static void main(String[] args) {
        
        int[] arr = new int[]{20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20,15,45,12,13,12,55,67,87,98,98};

        HashMap<Integer,Integer> hm = new HashMap<>();

        int count =0;

        //storing logic
        for (int i = 0; i < arr.length; i++) {
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i], count++); // if not present
            }else{
                hm.put(arr[i], Integer.valueOf(hm.get(arr[i])+1));
            }
        }

        System.out.println(hm);
    }
    
}

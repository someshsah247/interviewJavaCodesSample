package com.learn.basics.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Deloitte2 {
    public static void main(String[] args) {
        //duplicate and find the missing number.
        int []  arr = new int[]{1,3,3,6,4,5,9,8,7,10}; // 10
        int count =1;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i]))
                map.put(arr[i],count);
            else
                map.put(arr[i],map.get(arr[i])+1);
        }

        //duplicate
        for (int i = 0; i < map.size(); i++) {
            if(map.get(i) == null){
                System.out.println("Missing number - "+ i);
                break;
            }
        }



//        List list = Arrays.stream(arr).boxed().distinct().toList();
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        sum





    }
}

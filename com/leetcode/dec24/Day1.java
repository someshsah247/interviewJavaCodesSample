package com.leetcode.dec24;

import java.util.HashSet;
import java.util.Set;

// 1346. Check If N and Its Double Exist
public class Day1 {

    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i<arr.length; i++){
            if(set.contains(arr[i] * 2) || ( arr[i]%2==0 && set.contains(arr[i]/2) ) ){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }

    // public boolean checkIfExist(int[] arr) {
    //     for(int i = 0 ; i<arr.length; i++){
    //         for(int j = i+1 ; j<arr.length; j++){
    //             if(arr[i] == arr[j]*2){
    //                 return true;
    //             }
    //             if(arr[i] * 2==arr[j]){
    //                 return true;
    //             }
    //         }
    //     }
    //         return false;
    //     }


}

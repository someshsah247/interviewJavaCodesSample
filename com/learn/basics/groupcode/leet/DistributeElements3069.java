package com.learn.basics.groupcode.leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistributeElements3069 {

    public static int[] resultArray(int[] nums) {

        List<Integer> listA = new ArrayList<>();
        listA.add(nums[0]);
        List<Integer> listB = new ArrayList<>();
        listB.add(nums[1]);

        for (int i = 2; i < nums.length; i++) {
            if ( listA.get(listA.size()-1) < listB.get(listB.size()-1)){
                listB.add(nums[i]);
            }else{
                listA.add(nums[i]);
            }
        }
        return Stream.concat(listA.stream(),listB.stream()).toList().stream().mapToInt(x->x.intValue()).toArray();
    }

    public static void main(String[] args) {
        int arr[] = new int[]{5,4,3,8};
        System.out.println(Arrays.toString(resultArray(arr)));
    }

}


/*
[a,b,c,d,...]

step-1 --> get first element arr[0]=a ==> [a]
step-2 --> get 2nd element arr[1]=b  ==> [b]
step-3 -->
    a) start comparing last element of both independent array arrA[] , arrB[]
    b) if a>b --> add c to a else
    c) else if b>a add c to b
    d) Repeat a-c till the last of main array
step-4 -->
 */
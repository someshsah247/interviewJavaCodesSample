package com.learn.basics.array;

public class SumOfArray {

    public static void main(String[] args) {

        int a[] = new int[]{10,2,3,4,5,6,7,8,9,10,11,12,13};
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum+= a[i];
        }
        System.out.println(sum);
    }
}

package com.learn.basics.geeksforgeeks.arrays;

import java.util.Scanner;

// Array operations (Search, insert, delete)
public class ArrayBasicOperation {

    public static void main(String[] args) {
        int intArrray[] = new int[]{2,4,6,8,3,6,7,11,15};

        Scanner sc = new Scanner(System.in);

        //search
        System.out.println("Please enter number to find");
        int findNum = sc.nextInt();
        for (int i = 0; i < intArrray.length ; i++) {
            if(findNum==intArrray[i]){
                System.out.format("Found at position %d", i+1);
                System.exit(0);
            }
        }
        System.out.println("Not Found.");

    }

}

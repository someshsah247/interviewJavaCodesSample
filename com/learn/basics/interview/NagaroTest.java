package com.learn.basics.interview;

/*
Quest 1 --
Input 1 -- number of student -- 3
Input 2 -- number of subject -- 5
Input 3 (array) -- 3 array with 5 subject data
        s1 - {10,20,30,40,50}
        s2 - {15,25,35,45,58}
        s3 - {70,60,30,50,90}
Now from the input 3 -- you need to remove the lowest marks and then calculate average.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NagaroTest {

    private static void getInputAndCaluclateAvg(){

        // For taking input
        Scanner sc = new Scanner(System.in);
        //Total no of students
        System.out.println("Total Students");
        int studentCount = sc.nextInt();
        //Total subject count per student
        System.out.println("Total Subject");
        int subjectCount = sc.nextInt();

        //make array of numbers
        int[][] globleArray = new int[studentCount][subjectCount];
        System.out.println("Enter marks for 1 student");
        for(int i=0 ; i<studentCount; ++i){
            for (int j = 0; j < subjectCount; j++) {
                globleArray[i][j]=sc.nextInt();
            }
            int showCount = i+2;
            System.out.println("Enter marks for "+showCount+" student");
        }

        System.out.println("You have entered...");
        for(int i=0 ; i<studentCount; ++i){
            for (int j = 0; j < subjectCount; j++) {
                System.out.print(globleArray[i][j] + " ");
            }
            System.out.println();
        }

        // Now we need to remove lowest marks
        List<Integer> newList = new ArrayList<>();
        for(int i=0 ; i<studentCount; ++i){
            while(0<subjectCount){
               // newList.add(globleArray[i])
            }
        }



    }

    public static void main(String[] args) {

        getInputAndCaluclateAvg();

    }

}

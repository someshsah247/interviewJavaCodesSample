package com.codewithrohan.dayfive;

// 2011. Final Value of Variable After Performing Operations
// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/

public class PerformingOperations {

    public static void main(String[] args) {
        String performArray[] = new String[] {"--X","X++","X++"};
        System.out.println( getFinalValue(performArray));
    }

    private static int getFinalValue(String[] performArray) {
        int finalRes = 0 ;
        for (int i = 0; i < performArray.length; i++) {

            if( performArray[i] == "--X"){
                 finalRes = --finalRes;
            } else if( performArray[i] == "X--"){
                finalRes = finalRes--;
            } else if( performArray[i] == "++X"){
                finalRes = ++finalRes;
            } else if( performArray[i] == "X++"){
                finalRes = finalRes++;
            }
        }
        return finalRes;
    }
}

/*
public int finalValueAfterOperations(String[] operations) {
       int finalRes = 0 ;
        for (int i = 0; i < operations.length; i++) {

            if( operations[i].equals("--X") || operations[i].equals("X--") ){
                 finalRes = finalRes - 1;
            } else if( operations[i].equals("++X") || operations[i].equals("X++")){
                finalRes = finalRes + 1;
            }
        }
        return finalRes;
    }
 */

/*
int totalOperations = 0;
        for (int i = 0; i < operations.length; i++) {
            totalOperations = (operations[i].contains("++")) ? totalOperations + 1 : totalOperations - 1;
        }
        return totalOperations;
 */

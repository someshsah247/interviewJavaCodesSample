package com.learn.basics.earnwithkrishnasandeep;

import java.util.Stack;

// https://www.youtube.com/watch?v=jC_y-XbOXvg&list=PLF9tovyahfL2pF-DWH7WQyuN_Cmz64DTT&index=2&ab_channel=LearnWithKrishnaSandeep
public class StringWellFormed {

    public static void main(String[] args) {

        // String s = "[{()}]"; //Balanced
        String s = "[{))}]"; // NOT Balanced

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length() ; i++) {
            
            char ch = s.charAt(i); // storing current character in ch variable
            
            if(stack.empty()) // if empty (run only first time) -- put elements in stack
                stack.push(ch);
            else
                if ( ch == '{' || ch == '(' || ch == '['  ) {  // check all open brackets -- if yes, then insert
                stack.push(ch);
            } else
                if ( ch == '}' && stack.peek() == '{' ) {  // check if it is closing + top of stack is same of opening type , then pop
                stack.pop();
            } else
                if ( ch == ']' && stack.peek() == '[' ) {  // check if it is closing + top of stack is same of opening type , then pop
                    stack.pop();
                } else
                if ( ch == ')' && stack.peek() == '(' ) {  // check if it is closing + top of stack is same of opening type , then pop
                    stack.pop();
                }

        } // ending for loop


        // if stack is empty it means guven string is balanced.
        System.out.println( (stack.empty() && stack.size()>0) ? "Balanced String" : "Not Balanced String");

        // Note - stack.empty() returns [] --> so we have to check size.
    }


}

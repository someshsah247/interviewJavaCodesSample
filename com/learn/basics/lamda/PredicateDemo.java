package com.learn.basics.lamda;

import java.util.function.Predicate;

/*
boolean test(T t)
Evaluates this predicate on the given argument.
Parameters:
t - the input argument
Returns:
true if the input argument matches the predicate, otherwise false 
 */

public class PredicateDemo {
	
	public static void main(String[] args) {
		
		Predicate<String> predicate = (s) -> s.equals("somesh");
		System.out.println(predicate.test("somesh"));
		System.out.println(predicate.test("sah"));
	}
}

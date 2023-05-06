package com.learn.basics.lamda;

import java.util.function.Function;

// https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
/*
 R apply(T t)
Applies this function to the given argument.
Parameters:
t - the function argument
Returns:
the function result
 */

public class FuncationDemo {
	
	public static void main(String[] args) {
		// Function<T, R>
		Function<String,Integer> function = (String s) -> s.length();
		System.out.println(function.apply("somesh"));
	}
}

package com.learn.basics.methodreference;

import java.util.function.BiFunction;
import java.util.function.Function;

//Method References -- Static Method   (Reference to a static method)
//Syntax --  ContainingClass::staticMethodName

public class StaticMethodRef {
	
	// one more static method
	public static int addition(int i , int j ) {
		return i+j;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Lambda Way 
		Function<Integer, Double> function = (i)-> Math.sqrt(i);
		System.out.println(function.apply(5));

		//Using Method References 
		Function<Integer, Double> function2 = Math::sqrt;
		System.out.println(function2.apply(4));
		
		
		// static method -- for above method -- Lambda way
		BiFunction<Integer,Integer,Integer> biFunction = (i, j) -> i+j;
		System.out.println(biFunction.apply(5, 6));
		
		////Using Method References 
		BiFunction<Integer,Integer,Integer> biFunction2 = StaticMethodRef::addition;
		System.out.println(biFunction2.apply(7, 6));
	}

}

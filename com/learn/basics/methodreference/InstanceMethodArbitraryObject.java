package com.learn.basics.methodreference;

import java.util.function.Function;

// Reference to an instance method of an arbitrary object of a particular type
public class InstanceMethodArbitraryObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Lambda Way 
		Function< String, String > function = (input)-> input.toLowerCase();
		System.out.println(function.apply("SomEShsjbERFVJ"));
		
		//method reference way 
		Function<String, String> function2 = String::toLowerCase;
		System.out.println(function2.apply("SOMESH SAH"));

	}

}

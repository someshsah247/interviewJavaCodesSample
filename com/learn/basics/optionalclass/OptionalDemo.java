package com.learn.basics.optionalclass;

import java.util.Optional;

//Optional is a new type introduced in Java 8. It is used to represent a value that may or may not be present. In other words, an Optional object can either contain a non-null value (in which case it is considered present) or it can contain no value at all (in which case it is considered empty).

public class OptionalDemo {
	
	public static void main(String[] args) {
		
		String email = "Somesh.Sah@gail.commmm";
		String nullEmail = null;
		
		// Optional Class Static methods 
		
		//empty() -- used to print 
		Optional<String> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);
		
		//of() -- used to 
		Optional<String> ofOtionalEmail = Optional.of(email);
		System.out.println(ofOtionalEmail);
		//Optional<String> ofOtionalEmail1 = Optional.of(nullEmail);
		//System.out.println(ofOtionalEmail1); // it will give java.lang.NullPointerException
		
		//Nullable() method
		Optional<String> nullableOtionalEmail = Optional.ofNullable(email);
		System.out.println(nullableOtionalEmail);
		Optional<String> nullableOtionalEmail1 = Optional.ofNullable(nullEmail);
		System.out.println(nullableOtionalEmail1);
		
		// Now Normal Methods 
		
		//get() method 
		// Optional[Somesh.Sah@gail.commmm] ---> Somesh.Sah@gail.commmm
		Optional<String> nullableOtionalEmail12 = Optional.ofNullable(email);
		System.out.println(nullableOtionalEmail12.get());
		
		// directly we dont call get method -- first we check optional class has value or not 
		if(nullableOtionalEmail12.isPresent()) {
			System.out.println(nullableOtionalEmail12.get());
		}else {
			System.out.println("no-value found");
		}
		
		// get Default Value -- if value is not present 
		// it will take String as a parameter 
		System.out.println(nullableOtionalEmail1.orElse("abe value nahi h "));
		
		// orElesGet method it is same as orEles method but it will take Supplire Interface(Predict)
		System.out.println(nullableOtionalEmail12.orElseGet(()-> "NoValue in Lambd Way") );
		
		// orElseThrow() used fro throw error
		// System.out.println(nullableOtionalEmail1.orElseThrow(()-> new IllegalArgumentException("Email is null")));
	
		//Normal Method to find a value and print it 
		String  result = " abcd ";
		if(result != null && result.contains("abcd"))
			System.out.println(result);
		else
			System.out.println("No value found");
		//Optional Ways
		Optional<String> resuOptional = Optional.of(result);
		// filter -- need pridect
		resuOptional.filter((res)->res.contains(res))
		.ifPresent((res)-> System.out.println(res));
		// map -- need pridect
		resuOptional.filter((res)->res.contains(res))
		.map(String::trim)
		.ifPresent((res)-> System.out.println(res));
				
	
	}
	
}

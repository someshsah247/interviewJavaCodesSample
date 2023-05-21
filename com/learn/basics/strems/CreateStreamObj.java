package com.learn.basics.strems;

import java.util.*;
import java.util.stream.Stream;

public class CreateStreamObj {

	public static void main(String[] args) {

		// create stream
		Stream<String> stream = Stream.of("somesh","ram","rahem","aksah","rohit");
		stream.forEach(System.out::println);
		//stream.count();
		//System.out.println("count ");
		
		//create a strem from source
		Collection<String> collection = Arrays.asList("java","c++","c","python","html");
		Stream<String> stream2 = collection.stream();
		stream2.forEach(System.out::println);
		
		//from List/Set
		List<String> list = Arrays.asList("java1","c++1","c1","python1","html1");
		Stream<String> stream3 = list.stream();
		stream3.forEach(System.out::println);
		
		//from Array
		String[] strArr = {"a","b","c","d","e","f","g"};
		Stream<String> stream4 = Arrays.stream(strArr);
		stream4.forEach(System.out::println);
		
	}
	

}

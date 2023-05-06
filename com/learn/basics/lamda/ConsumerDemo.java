package com.learn.basics.lamda;

import java.util.function.Consumer;

/*
void accept(T t)
Performs this operation on the given argument.
Parameters:
t - the input argument
 */

public class ConsumerDemo {
	
	public static void main(String[] args) {
		//Consumer<T>
		Consumer<Integer> consumer = (i)-> {
			if(i>18) 
				System.out.println("Aligible for vote");
			else
				System.out.println("Not Aligible for vote");
		};
		
		consumer.accept(15);
		consumer.accept(21);
	}
	
	

}

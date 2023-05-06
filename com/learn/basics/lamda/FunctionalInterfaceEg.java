package com.learn.basics.lamda;

/*
 * Java Functional Interfaces. An Interface that contains exactly one abstract method is 
 * known as functional interface. It can have any number of default, static methods but can
 * contain only one abstract method. It can also declare methods of object class.
 */

@FunctionalInterface
public interface FunctionalInterfaceEg {
	
	void myMethods(); // only 1 methods
	
	// Default method -- you can over ride in other class or interface
	default void defaultMethod() {
		System.out.println("Default message");
	}
	
	static void staticMethod() {
		System.out.println("Static message");
	}

}

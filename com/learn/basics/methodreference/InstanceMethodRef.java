package com.learn.basics.methodreference;

//Reference to an instance method of a particular object

@FunctionalInterface
interface PrintableInterface {
	void print(String msg);
}

public class InstanceMethodRef {
	
	void displayInUpper(String msg) {
		System.out.println(msg.toUpperCase());
	}

	public static void main(String[] args) {
		// Reference to an instance method of a particular object
		
		InstanceMethodRef instanceMethodRef = new InstanceMethodRef();
		
		// Lambda Express way 
		PrintableInterface printableInterface = (msg)-> instanceMethodRef.displayInUpper(msg);
		printableInterface.print("somesh");
		
		// Method Reference way
		PrintableInterface printableInterface2 = instanceMethodRef::displayInUpper;
		printableInterface2.print("somesh Sah");
		

	}

}

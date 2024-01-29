package com.learn.basics.customexception;

public class VoteClass {

	public static void main(String[] args) {
		
		int age = 17; // chnage this number.

		try {
		if(age>18) {
			System.out.println("Valid Age.");
		}else {
			throw new InvalidAgeException("Not a Valid Age.");
		}

		}catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Working Finally.");
		}

	}

}

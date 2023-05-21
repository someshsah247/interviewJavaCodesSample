package com.learn.basics.customexception;

public class VoteClass {

	public static void main(String[] args) {
		
		int age = 17; // chnage this number.

		try {
		if(age>18) {
			System.out.println("Vaild Age");
		}else {
			throw new InvalidAgeException("ERROR");
		}

		}catch (InvalidAgeException e) {
			System.out.println(e.getMessage()+12);
		}
		finally {
			System.out.println("Working finally.");
		}

	}

}

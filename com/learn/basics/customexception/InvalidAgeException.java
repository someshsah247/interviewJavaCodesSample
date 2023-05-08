package com.learn.basics.customexception;

public class InvalidAgeException extends RuntimeException {
	
	public InvalidAgeException(String message) {
		super(message);
	}

}

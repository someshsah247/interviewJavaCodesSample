package com.learn.basics.lamda;

public class FunctionalInterfaceEgDemo implements FunctionalInterfaceEg {

	@Override
	public void myMethods() {
		// TODO Auto-generated method stub
		System.out.println("Traditinal way to user interce method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInterfaceEgDemo demo = new FunctionalInterfaceEgDemo();
		demo.myMethods();
		demo.defaultMethod(); // we can override it as well.
		FunctionalInterfaceEg.staticMethod();
	}

}

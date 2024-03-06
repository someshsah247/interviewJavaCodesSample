package com.learn.basics.inheritance;

class Parent{
    //instance variable
    String name = "PC";

    //constructor
    public Parent(){
        System.out.println("Parent constructor");
    }

    // instance method
    public void parentMethod(){
        System.out.println("Parent method");
    }

}

class Child extends Parent{
    // Child se Parent class ke variable, method and constructor ko access kiya.

    //instance variable
    String name = "CC";

    //constructor
    public Child(){
        super(); // Parent class constructor call
        System.out.println("Child constructor");
    }

    public void printSuperClassVariableName(){
        System.out.println(super.name); // parent class variable call
    }

    // instance method
    public void parentMethod(){
        super.parentMethod(); // Parent Class method call
        System.out.println("Child method");
    }

}



public class SuperThis {

    public static void main(String[] args) {

      Child c = new Child();
      System.out.println("===================");

      c.parentMethod();
      System.out.println("===================");

      c.printSuperClassVariableName();
      System.out.println("===================");

      String name = c.name;
      System.out.println(name);



    }

}

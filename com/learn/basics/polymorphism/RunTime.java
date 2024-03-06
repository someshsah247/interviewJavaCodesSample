package com.learn.basics.polymorphism;

// RunTime == Method Overriding.

// Implementing a class
class Test {

    // Implementing a method
    public void method()
    {
        System.out.println("Method 1");
    }
}
public class RunTime extends Test {
    public void method()
    {
        System.out.println("Method 2");
    }

    // Driver code
    public static void main(String args[])
    {
        Test test = new RunTime();
        test.method();

//        Test test1 = new Test();
//        test1.method();
    }
}

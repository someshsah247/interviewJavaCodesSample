package com.learn.basics.interview;

class Parent{
    void m1(){
        System.out.println("Parent --> m1()");
    }
}

class Child extends Parent{
    void m1(){
        System.out.println("Child --> m1()");
    }
    void m2(){
        System.out.println("Child --> m2()");
    }
}

public class ABCTest1 {

    public static void main(String[] args) {
        Parent p = new Parent();
        p.m1();

        Parent pc = new Child();
        pc.m1();
        //pc.m2(); // cannot find symbol -- method m2() --   variable aa of type com.learn.basics.interview.A


        //Child cp = new Parent(); // Down caste nahi kr sakte hai
        Child c = new Child();
        c.m2();
        c.m1();
        // c se parent ka m1 kaise call hoga ?


        /*

        Parent p = new Parent(); // valid
        Parent pc = new Child();  // valid
        Child c = new Child(); // vaild
        XXX Child cp = new Parent(); // NOT VALID;





         */


    }
}

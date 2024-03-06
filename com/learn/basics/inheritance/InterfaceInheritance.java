package com.learn.basics.inheritance;

interface A{
    //void m1();

//    default void d1(){
//        System.out.println("D-A");
//    }

//    static void s1(){
//        System.out.println("S-A");
//    }

    void Am();
}

interface B{
   // void m1();

//    default void d2(){
//        System.out.println("D-A");
//    }

//    static void s1(){
//        System.out.println("S-A");
//    }

    void Bm();
}

public class InterfaceInheritance implements A,B {

    @Override
    public void Am() {

    }

    @Override
    public void Bm() {

    }
}

// conculsion
//
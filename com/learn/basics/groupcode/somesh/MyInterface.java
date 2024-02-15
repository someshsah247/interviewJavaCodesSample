package com.learn.basics.groupcode.somesh;

public interface MyInterface {

    default void mydefaultMethod1(){
        System.out.println("instance default method");
    }

       static void mydefaultMethod2(){
        System.out.println("instance default method");
    }

}

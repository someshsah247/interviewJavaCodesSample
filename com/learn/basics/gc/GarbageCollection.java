package com.learn.basics.gc;

public class GarbageCollection {

    private GarbageCollection gcc3;

    public static void main(String[] args) {

        GarbageCollection gcc1 = new GarbageCollection();
        //gcc1 = null;

        GarbageCollection gcc2 = new GarbageCollection();
        //gcc2 = null;


        // * Island of isolation
        gcc1.gcc3 = gcc2;
        gcc2.gcc3 = gcc1;

        gcc1 = null;
        gcc2 = null;
        gcc2=gcc1;

        //System.gc(); // way 1
        //Runtime.getRuntime().gc(); // way 2

    }

    @Override
    protected void finalize() throws Throwable {
        // method used to check -- gc called or not.
        // because it is used  just before destroying object to delete live reference -- called by JVM -- object class method.
        System.out.println("bro gc called");
    }
}

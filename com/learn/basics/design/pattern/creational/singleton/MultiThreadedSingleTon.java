package com.learn.basics.design.pattern.creational.singleton;

class Samosha{

    static Samosha samosha = null;
    private Samosha(){}

    // method b synchronized kr sakte hai
    // block b synchronized kr sakte hai
    public static Samosha getInstance(){
        if (samosha == null){
        synchronized (Samosha.class) {
            if (samosha == null)
                samosha = new Samosha();
            }
        }
        return samosha;
    }
}

public class MultiThreadedSingleTon {
}

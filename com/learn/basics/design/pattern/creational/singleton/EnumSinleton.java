package com.learn.basics.design.pattern.creational.singleton;

public enum EnumSinleton {

    // best way -- no issue -- perfectly working for all scenario

    INSTANCE;

    public void doSOmeImptTask(){
        System.out.println("created singleton using ENUM");
    }
}

package com.learn.basics.scenario.a;

public class TestClassEg1 implements InterFace1,InterFace2{

    // 2 interface have same name default method
    // and 1 class in implements both interface then


    @Override
    public void mytestmethodx() {
        InterFace2.super.mytestmethodx();
    }

}

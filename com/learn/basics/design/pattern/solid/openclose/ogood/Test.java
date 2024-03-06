package com.learn.basics.design.pattern.solid.openclose.ogood;

public class Test {

    // This is open for extention ---  add new interface for multiple and divide and it will work perfectly
    // No need to modify

    void doOperation(int x, int y, CalciOperation calciOperation){
        calciOperation.operartion(x,y);
    }

    public static void main(String[] args) {
        Test t = new Test();
        //sum
        t.doOperation(4,5,new Add());
        //sub
        t.doOperation(4,5,new Sub());
    }
}

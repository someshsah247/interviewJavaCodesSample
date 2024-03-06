package com.learn.basics.design.pattern.solid.openclose.ogood;

public class Sub implements CalciOperation{
    @Override
    public void operartion(int a, int b) {
        System.out.println("sub - " + (a-b) );
    }
}

package com.learn.basics.design.pattern.solid.openclose.ogood;

public class Add implements  CalciOperation{
    @Override
    public void operartion(int a, int b) {
        System.out.println("sum - " + (a+b) );
    }

}

package com.learn.basics.design.pattern.solid.openclose.obad;

public class MainClasss {
    public static void main(String[] args) {
        BadCalculator bc = new BadCalculator();
        bc.calci();
        // if we need to add additional functionality like (multiply , divide) it will lead to code change
    }
}

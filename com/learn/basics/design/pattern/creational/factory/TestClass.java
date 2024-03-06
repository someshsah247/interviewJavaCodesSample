package com.learn.basics.design.pattern.creational.factory;

public class TestClass {
    public static void main(String[] args) {
        OperatingFactory of = new OperatingFactory();
        System.out.println(of.createOs("W"));
        System.out.println(of.createOs("L"));

    }
}

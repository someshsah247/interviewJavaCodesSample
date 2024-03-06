package com.learn.basics.design.pattern.creational.singleton;

class Loggersss {
    /*
--> Problem --
        1- ye pe object class load hote he create ho jaye ga -- it may possible ki hum log iss object ko use he nahi kr rahe ho.
 */
    public static Loggersss log = new Loggersss();

    //private constructor -- so no one eles is able to create object
    private Loggersss() {
    }

    public static Loggersss getLoggersObj() {
        System.out.println("Eager Factory Method called");
        return log;
    }
}


public class EagerSingleTonClass {
    public static void main(String[] args) {
        Loggersss loggers = Loggersss.getLoggersObj();
        System.out.println(loggers.hashCode());
        Loggersss loggers2 = Loggersss.getLoggersObj();
        System.out.println(loggers2.hashCode());
        System.out.println(Loggersss.getLoggersObj().hashCode());
    }
}


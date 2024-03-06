package com.learn.basics.design.pattern.creational.singleton;

class Loggers {

    /*
    --> Problem --
            1- ye multi-threading ko support nahi krta hai -- iske liye hum log Eager wala code likhe ge...
     */

    public static Loggers log = null;

    private Loggers() {
    }

    public static Loggers getLoggersObj() {
        System.out.println("Lazy Factory Method called");
        if (log == null)
            log = new Loggers();
        return log;
    }
}


public class LazySingleTonClass {
    public static void main(String[] args) {
        Loggers loggers = Loggers.getLoggersObj();
        System.out.println(loggers.hashCode());
        Loggers loggers2 = Loggers.getLoggersObj();
        System.out.println(loggers2.hashCode());
        System.out.println(Loggers.getLoggersObj().hashCode());
    }
}

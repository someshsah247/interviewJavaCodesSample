package com.learn.basics.other;

public class OrderExecution {
    {
        //instance block
        System.out.println("instance block");
    }

    static {
        System.out.println("static block");
    }

    public OrderExecution(){
        System.out.println("constructor");
    }


    public static void main(String[] args) {

        OrderExecution oe = new OrderExecution();

        //Shutdown Hooks
        Thread printingHook = new Thread(() -> System.out.println("In the middle of a shutdown"));
        Runtime.getRuntime().addShutdownHook(printingHook);
    }

}

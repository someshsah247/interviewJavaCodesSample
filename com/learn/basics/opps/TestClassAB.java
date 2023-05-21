package com.learn.basics.opps;

public class TestClassAB {

    public static void main(String[] args) {
        AClass a = new AClass();
        a.method(); // Aclass
        BClass b = new BClass();
        b.method(); // Bsclass

        AClass ab = new BClass();
        ab.method(); //Bsclass
        //BClass abc = new AClass(); // Error

//        BClass abc1 = (BClass) new AClass();
//        abc1.method(); //  cannot be cast to class
    }

}

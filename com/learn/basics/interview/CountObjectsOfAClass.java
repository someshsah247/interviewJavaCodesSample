package com.learn.basics.interview;

public class CountObjectsOfAClass {

    static int count=0;
    CountObjectsOfAClass(){
        System.out.println("Obj is created");
        count++;
    }
    public static void main(String[] args) {
        CountObjectsOfAClass obj1 = new CountObjectsOfAClass();
        CountObjectsOfAClass obj2 = new CountObjectsOfAClass();
        CountObjectsOfAClass obj3 = new CountObjectsOfAClass();
        CountObjectsOfAClass obj4 = new CountObjectsOfAClass();

        System.out.println(CountObjectsOfAClass.count);
    }
}

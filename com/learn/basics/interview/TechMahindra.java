package com.learn.basics.interview;

import java.util.HashMap;
import java.util.Map;

// "vishudh chutiya" tha interviewer.
public class TechMahindra {
    public static void main(String[] args) {
        String s = "object";
        String y = new String("object");
        //String y = new String("object1"); // in this case both are false.

        if(s == y ){
            System.out.println("s == y ");  // false
        }

        if(s.equals(y)){
            System.out.println("s.equals(y)"); // true
        }

        // Map
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"a");
        map.put(2,"b");
        map.put(1,"c");

        map.forEach((x,z) -> System.out.println(x + " " + z));
        //1,c -- 2,b
    }
}

/*
String s = "object";
 // String y = new String("object"); //

String y = new String("object1");

if(s == y ){
sop()
}

s.equials(y){
sop
}



Map<Integer,String> map = new HashMap<>();

map.put(1,"a");
map.put(2,"b");
map.put(1,"c");

map.forEach((x,y)-> sop(x + " " + y));
1,c -- 2,b

 */

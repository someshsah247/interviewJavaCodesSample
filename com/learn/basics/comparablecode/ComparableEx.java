package com.learn.basics.comparablecode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableEx {
    
    public static void main(String[] args) {
        
        List<Integer> listInt = new ArrayList<>();
        listInt.add(2); listInt.add(32);
        listInt.add(52); listInt.add(72);
        listInt.add(22); listInt.add(42);
        listInt.add(12); listInt.add(52);
        listInt.add(322); listInt.add(62);

        Collections.sort(listInt); // Comparable
        System.out.println(listInt);


    }
}

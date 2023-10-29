package com.learn.basics.map.ittration;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapIteration {

    public static void main(String[] args) {

        Map<String,String> map = new HashMap<String,String>();

        map.put("1","one");
        map.put("2","two");
        map.put("3","three");
        map.put("4","four");
        map.put("5","five");
        map.put("6","six");
        map.put("7","seven");
        map.put("8","eight");
        map.put("9","nine");
        map.put("10","ten");


        Set<Map.Entry<String, String>> entries = map.entrySet();
        
        // way 1
        Iterator<Map.Entry<String,String>> iterator = entries.iterator();

        while(iterator.hasNext()){
            Map.Entry<String,String> entry = iterator.next();
            System.out.println(entry.getKey() + "--> "+ entry.getValue());
        }

        // way 2
        for (Map.Entry<String,String> allEntry : entries ) {
            System.out.println(allEntry.getKey() + "--> "+ allEntry.getValue());
        }

        // way 3 -- java 8 way
        entries.forEach(e->{
            System.out.println(e.getKey() + "--> "+ e.getValue());
        });

        // way 4 -- > recommended way (Best way)
        // using foreach method of map interface
        map.forEach( (key,value)->{
            System.out.println("# "+key + "--> "+ value);
        });

    }
}

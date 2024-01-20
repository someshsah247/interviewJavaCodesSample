package com.learn.basics.array;

import java.util.*;

// https://java2blog.com/java-coding-interview-questions
// Question 16 : Find minimum number of platforms required for railway station
public class TrainQuestion {

    private static int findMaxConsecutiveACount(String input) {
        int maxCount = 0;
        int currentCount = 0;

        for (char c : input.toCharArray()) {
            if (c == 'A') {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {

        double[] arrival = new double[]{1.00, 1.40, 1.50, 2.00, 2.15, 4.00};
        double[] departure = new double[]{1.10, 3.00, 2.20, 2.30, 3.15, 6.00};

        // meagre both array
        Map<Double,Character> meargMap = new TreeMap<>();

        for (int i = 0; i < arrival.length; i++) {
            meargMap.put(arrival[i],'A');
        }
        for (int i = 0; i < departure.length; i++) {
            meargMap.put(departure[i],'D');
        }

        System.out.println(meargMap); // current Data Set

        // Now Logic
        Set<Map.Entry<Double, Character>> entries = meargMap.entrySet();
        Iterator<Map.Entry<Double,Character>> iterator = entries.iterator();
        StringBuffer sb = new StringBuffer();
        while(iterator.hasNext()){
            Map.Entry<Double, Character> entry = iterator.next();
            //System.out.println(entry.getKey() + "--> "+ entry.getValue());
            //System.out.print(entry.getValue()); // ADAAAADDDDAD
            // get maximum number of A
            sb.append(entry.getValue()); // converting char to String
        }
        System.out.println("Total Station -- "+ findMaxConsecutiveACount(sb.toString()));
    }

}

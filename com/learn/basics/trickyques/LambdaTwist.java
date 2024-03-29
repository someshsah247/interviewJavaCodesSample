package com.learn.basics.trickyques;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaTwist {

    //Write a program to change the first character to uppercase in a list of Strings using streams API
    private static void getUpperCaseString(List<String> names){
        System.out.println(
                names.stream().map(x-> x.substring(0,1).toUpperCase() + x.substring(1))
                        .collect(Collectors.toList())
        );
    }

    //Write a program to print most repeated character in a string using streams
    private static void getFrequencyChar(String word){
        word.chars().boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().forEach((x)-> System.out.println(x.getKey()+ " - "+ x.getValue()));
    }

    //Find the 3rd highest number in a list of numbers using streams
    private static void getHighestElement(int[] arr, int position){
        System.out.println(
        Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder())
                .limit(position).skip(position-1).findFirst().get()
        );
    }

    //Write a program to print how many times vowels repeating in a string
    private static void getVowelsFrequency(String word){
        // this time will use map
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            if(!map.containsKey(word.charAt(i))){
                map.put(word.charAt(i),1);
            }else {
                map.put(word.charAt(i),map.get(word.charAt(i))+1);
            }
        }
        // FREQUENCY code.
        //map.forEach((x,y)-> System.out.println(x + " - "+y));

        // display vowel
        map.forEach((x,y)-> {
            if( x=='a' || x=='e' || x=='i' || x=='o' || x=='u')
                    System.out.println(x + " - "+y);
        });
    }

    // List of name --- repeated find out names and its occurrences
    private static void colorList(List<String> list){
        list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().forEach((x -> System.out.println(x.getKey() + " - "+ x.getValue())));
    }

    // Find out highest occurrence of number in integer array
    private static void highestoccurenceInt(int[] arr){
        Set<Map.Entry<Integer,Long>> map = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet();
        System.out.println(map.stream().max(Comparator.comparingLong(Map.Entry::getValue)).get()) ;
    }

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("somesh"); names.add("Shalini"); names.add("ANshu"); names.add("Pawan"); names.add("roHit"); names.add("sai");
        //getUpperCaseString(names);

        //getFrequencyChar("somesh");

        int[] arr = new int[]{98,67,12,14,43,21,76,36,9,87,50,78,14,98,98, 50, 50, 50};
        //getHighestElement(arr ,3);

        //getVowelsFrequency("shalini");

        List<String> color = new ArrayList<>();
        color.add("red"); color.add("green"); color.add("orange"); color.add("pink"); color.add("black"); color.add("blue");
        color.add("red"); color.add("yellow"); color.add("gray"); color.add("pink"); color.add("blue"); color.add("blue");
        //colorList(color);

        highestoccurenceInt(arr);


    }
}

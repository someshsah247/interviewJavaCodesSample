package com.learn.basics.interview;

import java.util.HashMap;
import java.util.Map;

public class AspireSystemsL1 {

    //Find the repeating words in the given string
    //String input = "The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the fence"

    public static void displayDuplicates(){

        String sen = "The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the fence".toUpperCase();
        String[] words = sen.split(" ");

        Map<String, Integer> map = new HashMap();

        for(int i=0; i<words.length ; i++){
            if(!map.containsKey(words[i])){
                map.put(words[i],1);
            }else{
                map.put(words[i],map.get(words[i])+1);
            }
        }

        // display only duplicates
        for(int j = 0 ; j < map.size() ; j++){
            if(map.get(words[j])>1){
                System.out.println( "Duplicate - " + words[j] );
            }
        }
    }

    public static void main(String[] args) {
        displayDuplicates();
    }

}

/*
Find the repeating words in the given string
String input = "The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the fence"


public void displayDuplicates(String len){

String sen = len.toUpper();
String[] words = sensplit(" ");

Map<String, Integer> map = new HashMap;

	for(int i=0; i<=words.lenght() ; i++){
		if(!map.contains(words[i])){
			map.put(words[i],1);
		}else{
			map.put(words[i],map.get(words[i])+1);
		}
	}

	// display only dublicates
	for(int j = 0 ; map.size() ; j++){
		if(map.get(word[j]>1){
		System.out.println( "Duplicate -" + word[j] )
			}
	}

}

 */
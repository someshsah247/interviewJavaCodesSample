package com.learn.basics.array;

import java.util.Iterator;

//WAP to find out all the duplicate element in the array.
//Answer -- use hashmap

public class DuplicateElement {
	
	// duplicate function for string
	
	public String[] dublicateString(String[] s) {
		String[] dublicate = new String[s.length];
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s.length;j++) {
				if(s[i]==s[j]) {
					dublicate[i] = s[i];
				}
				else {
					dublicate[i] = null;
				}
			}
		}
		return dublicate;
		
	}
	
	//dublicate funstion for number
	
	
	
	public static void main(String[] args) {
		
		int[] number = new int[6];
		number[0]=2; number[1]=3;
		number[2]=4; number[3]=5;
		number[4]=2; number[5]=3;
		String[] letters = new String[] {"a","b","c","d","e","a","a","c"};
		
		DuplicateElement de = new DuplicateElement();
		
		//System.out.println(de.dublicateString(letters).toString());
		
		String[] answer = de.dublicateString(letters);
		
		for (int i = 0; i < answer.length; i++) {
			if(answer[i]!=null)
			System.out.println(answer[i]);
		}
		
	}

}

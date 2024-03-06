package com.learn.basics.trickyques.stringques;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringProblem {

    // word reverse
    private static String reverseWord(String s){
        String reverse = "";
        for (int i = s.length()-1; i >= 0 ; i--) {
            reverse += s.charAt(i);
        }
        return reverse;
    }

    // sentance word reverse in place
    // else one any to tell don't please person, good very am i
    private static String sentanceReverseInPlace(String s){
        String revSen = "";
        String[] arrString = s.split("\s");
        for (int i = arrString.length-1; i >=0 ; i--) {
            revSen += arrString[i] +" ";
        }
        return revSen;
    }

    private static String spaceConstantReverse(String s){
        int index = s.length();
        char ch[] = new char[index];

        for (int i = 0; i < index ; i++) {
            ch[i] = s.charAt(i);
        }

        String revWithoutSpace = "";
        for (int i = ch.length-1; i >= 0; i--) {
            if(ch[i] != ' '){
                revWithoutSpace += ch[i];
            }
        }

        System.out.println("revWithoutSpace - "+ revWithoutSpace);

        char newCh[] = new char[index];

        int i = 0;

        while(i <= index){
            if(ch[i]==' ')
                newCh[i] = ' ';
            else {
                newCh[i] = revWithoutSpace.charAt(i);
            }

        }

//        for (int i = ch.length-1; i >= 0; i--) {
//                if(ch[i]==' '){
//                    newCh[] = ch[i];
//                    index++ ;
//                }else{
//                    newCh[index-i] = revWithoutSpace.charAt(i);
//                    index++;
//                }
//        }
        System.out.println(Arrays.toString(newCh));
        return Arrays.toString(newCh);
    }

    private static void wordCount(String sentance){
        String str[] = sentance.split("\s");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i] +" - "+str[i].length());
        }
    }

    private static void frequencyOfWord(String word){
    Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {

        }
    }

    private static void palindrome(String word){
        boolean isPalindrome =false;
        for (int i = 0, j=word.length()-1; i < word.length()/2 ; i++,j--) {
            if(word.charAt(i) != word.charAt(j)){
                isPalindrome = false;
                break;
            }
            isPalindrome=true;
        }
        if(isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    private static void sortWordsInOrder(String[] arr){
        System.out.println( "Ascending - "+Arrays.stream(arr).sorted().collect(Collectors.toList()));
        System.out.println( "Descending - "+Arrays.stream(arr).sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
        System.out.println( "each reversed with sort - "+Arrays.stream(arr).sorted().map(x->new StringBuilder(x).reverse()).collect(Collectors.toList()));

    }



    public static void main(String[] args) {
        String word = "somesh";
        String sentance = "i am very good person, please don't tell to any one else";

        // input - somesh
        // output - hsemos
         System.out.println(reverseWord(word));
         System.out.println(reverseWord(sentance));

        System.out.println();
        System.out.println("########################################");
        System.out.println();

        // input  - i am very good person, please don't tell to any one else
        // output - else one any to tell don't please person, good very am i
        System.out.println(sentanceReverseInPlace(sentance));


        System.out.println();
        System.out.println("########################################");
        System.out.println();

        // reverse string but space constant
        //  input  = I Love My India.
        //  output = . aidn iy mevolI
        //System.out.println(spaceConstantReverse(sentance));

        System.out.println();
        System.out.println("########################################");
        System.out.println();

        // count per word in string
        // input - i am somesh
        //output - i = 1, am = 2 , somesh = 6
        StringProblem.wordCount(sentance);

        System.out.println();
        System.out.println("########################################");
        System.out.println();

        // frequency or occurrence

        System.out.println();
        System.out.println("########################################");
        System.out.println();

        //Remove Duplicate Characters In A String

        // sorting in string array
        // ['Yash','Sahil','Pagar','Akhil']
        // Akhil,Pagar,Sahil,Yash
        String[] sArr = new String[]{"Rohan", "Shalini", "Somesh", "Akash", "Anshu","Yesh","Bharti"};
        sortWordsInOrder(sArr);

        // palindrome
        // StringProblem.palindrome("madam");
        // StringProblem.palindrome(word);

        // Anagram

        // string length without using length function

        // find the first non-repeated character in a string using an array.

        //count the number of occurrences of a character in a string in Java.

        //Find all substrings of String in java?

        //How to check if one String is rotation of another String in java?

int age = 14;
assert  age <= 18 : "cannot vote";
        System.out.println("age "+ age);
    }
}

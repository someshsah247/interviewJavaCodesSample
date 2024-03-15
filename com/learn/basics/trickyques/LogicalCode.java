package com.learn.basics.trickyques;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class LogicalCode {

    private static void stringSum(String a, String b) throws Exception{
//        try {
//            int num1 = Integer.parseInt(a);
//            int num2 = Integer.parseInt(b);
//            System.out.println("Sum - "+ (num1+num2));
//        }catch (Exception e){
//            System.out.println("Exception");
//        }

        BigInteger bg1 = new BigInteger(a);
        BigInteger bg2 = new BigInteger(b);
        System.out.println(bg1.add(bg2));
    }

    private static void convertBinaryToDecimal(String binaryVal){
        binaryVal = new StringBuilder(binaryVal).reverse().toString();
        int len = binaryVal.length();
        Double totalVal = 0.0;

        for (int i = 0; i <len; i++) {
            if(binaryVal.charAt(i) == '1')
                totalVal += Math.pow(2,i);
        }
        System.out.println(totalVal.intValue());
    }

    private static void listOfOperations(String[] arr,int initialVal){
//        set of operations = ["X++","++X","--X","X--", "X++"]
//        initial value = 5
//        final result ?
        //String new
        for (int i = 0; i < arr.length ; i++) {
//            if(arr[i].contains("+")){
//                initialVal++;
//            }else
//                initialVal--;
            initialVal = arr[i].contains("+") ? initialVal+1 : initialVal-1;
        }
        System.out.println(initialVal);
    }


    private static void containsAllAlphabets(String sentence){
        Set<Character> s = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
//            if( !(s.contains(sentence.charAt(i))) // because iske ander bhi 1 loop hai.
//                   // (sentence.charAt(i) >= 'a' || sentence.charAt(i) <= 'z') &&
//                    //(sentence.charAt(i) >= 'A' || sentence.charAt(i) <= 'Z') &&
//                   // (sentence.charAt(' ') != ' ' )
//            ){
                s.add(sentence.charAt(i));
           // }
        }
        System.out.println( (s.size()==26 && !s.isEmpty()) ? true : false );

        // space --> order of n
        // time --> n^2 worst -- best nlogn
    }

    private static int[] getWordFindCount(List<String> words , String ch ){
        List<Integer> returnList = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            if(words.get(i).contains(ch)){
                returnList.add(i);
            }
        }
        return returnList.stream().mapToInt(x->x.intValue()).toArray();
    }

    private static  void returnParenthisisAsO(String str){
        String[] strArr = str.split("");
        String result = "";
        System.out.println(Arrays.toString(Arrays.stream(strArr).toArray()));
        for (int i = 0; i < strArr.length; i++) {
            if(strArr.length > i && Objects.equals(strArr[i], "(") && Objects.equals(strArr[i + 1], ")")){
                result+= "o";
                i++;
            }else {
                if(strArr.length > i && !Objects.equals(strArr[i], "(") && !Objects.equals(strArr[i], ")")  )
                    result+= strArr[i];
            }
        }
        System.out.println(result);
    }

    private static boolean robotReturnToOrigin(String instruction){
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < instruction.length() ; i++) {
            if(map.containsKey(instruction.charAt(i)))
                map.put(instruction.charAt(i),map.get(instruction.charAt(i)).intValue()+1);
            else
                map.put(instruction.charAt(i),1);
            }

            int U = map.containsKey('U') ? map.get('U') : 0;
            int D = map.containsKey('D') ? map.get('D') : 0;
            int L = map.containsKey('L') ? map.get('L') : 0;
            int R = map.containsKey('R') ? map.get('R') : 0;

            if((U == D) && (L==R)){
                    return true;
            }
            else {
                return false;
            }

        /*
        public boolean judgeCircle(String moves) {
        int dirA=0, dirB=0;
        for(int i=0; i<moves.length(); i++) {
            if(moves.charAt(i)=='U') {
                dirA++;
            } else if(moves.charAt(i)=='D') {
                dirA--;
            } else if(moves.charAt(i)=='L') {
                dirB++;
            } else if(moves.charAt(i)=='R') {
                dirB--;
            }
        }
        return (dirA==0 && dirB==0) ? true : false;
    }
         */
    }



    public static void main(String[] args) throws Exception {
        //stringSum("131","12345");

//        convertBinaryToDecimal("1000");
//        convertBinaryToDecimal("101");

//        String[] arr = new String[]{"X++","++X","--X","X--", "X++"};
//        listOfOperations(arr,5);

        //    Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
//    Output: true
//    Explanation: sentence contains at least one of every letter of the English alphabet.
//    Example 2:
//
//    Input: sentence = "leetcode"
//    Output: false
        //containsAllAlphabets("thequickbrownfoxjumpsoverthelazydog");
        //containsAllAlphabets("leetcode");

        List<String> names = new ArrayList<>();
        names.add("somesh"); names.add("Shalini"); names.add("ANshu"); names.add("Pawan"); names.add("roHit"); names.add("sai");
        //System.out.println(Arrays.toString(getWordFindCount(names, "s")));

        //returnParenthisisAsO("G()()()()(al)");
        //returnParenthisisAsO("(al)G(al)()()G");
        //returnParenthisisAsO("(al)(al)");

        System.out.println(robotReturnToOrigin("UDUD"));
        System.out.println(robotReturnToOrigin("UD"));
        System.out.println(robotReturnToOrigin("UDL"));

    }

}

package com.learn.basics.stringsss;

// WAP to count length of the string without using length function
public class StringLengthMethod {

    public static void main(String[] args) {
        String s = "somesh";
        int i = 0 ; // used for count

        // 1st way
//        for(char c: s.toCharArray()) {
//            i++;
//        }

        // 2nd way
        try{
            for (int j = 0;   ; j++) {
                if(s.charAt(i)!=' ') // any condition is fine -- when string is over , it will through exception
                    i++;
            }
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Exception");
        }

        System.out.println("Length of the given string :: "+i);

    }

}

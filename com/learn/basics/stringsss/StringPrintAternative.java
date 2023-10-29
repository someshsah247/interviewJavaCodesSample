package com.learn.basics.stringsss;

public class StringPrintAternative {

    public static void main(String[] args) {

        String a = "abc";
        String b = "def";
        // output = adbecf

//        for (int i = 0; i < a.length() ; i++) {
//            System.out.print(a.charAt(i)+b.charAt(i));// wrong -- 197199201
//        }

        for (int i = 0; i < a.length() ; i++) {
            System.out.print(a.charAt(i)+""+b.charAt(i)); // correct -- adbecf

        }
    }
}

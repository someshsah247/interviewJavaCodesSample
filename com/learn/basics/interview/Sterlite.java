package com.learn.basics.interview;

import java.util.Arrays;
import java.util.List;

public class Sterlite {

    // normal way
    private static void normalWay(String str){
        String[] arrStr = str.split(" ");
        for (int i = 0; i < arrStr.length; i++) {
            for (int j = arrStr[i].length()-1; j >= 0 ; j--) {
                System.out.print(arrStr[i].charAt(j) );
            }
            System.out.print(" ");
        }
    }

    private static void javaEightWay(String str){
       List<String> list = Arrays.stream(str.split(" ")).map(x-> String.valueOf(new StringBuilder(x).reverse())).toList();
        System.out.println(list);
    }


    public static void main(String[] args) {
        String str = "Times of India";   //  // semiT fo aidnI

        normalWay(str);
        javaEightWay(str);
    }

}


/*

Do this without using any java structure.
String str = "Times of India";
// semiT fo aidnI

1 . String[] strarr -- split(" ") i++
2 for loop i=0 to i<strarr.length

3. for loop  j=strarr[i].length j<0 j--
	4 . sop


 //Arrays.stream(str.split(" ")).map(x->x)

-- 3rd highest salary

select * from emp where id =( select id from emp order by salary desc limit 3); //

 */
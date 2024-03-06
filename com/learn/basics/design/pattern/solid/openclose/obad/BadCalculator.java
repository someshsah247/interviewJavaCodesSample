package com.learn.basics.design.pattern.solid.openclose.obad;

import java.util.Scanner;

public class BadCalculator {

    public void calci() {
        Scanner sc = new Scanner(System.in);
        String operator = sc.next();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = 0;

        switch (operator){
            case "sub" : result = num1+num2;
            break;
            case "sum" : result = num1+num2;
                break;
        }
        System.out.println(result);



    }
}

package com.learn.basics.interview;

public class BTGroup  {
    public static void main(String[] args) {
        String value = "234.00D";
        Double d = Double.parseDouble(value);

        //(d.intValue()==d) // This is wrong
        if(Double.compare(d.intValue(),d)==0){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }

    }

}

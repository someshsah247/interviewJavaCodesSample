package com.learn.basics.recursion;

public class FinonacciSeries {

    // 0 1 1 2 3 5 8 13 ...

    // Normal
    private void normalMethod( int total){
        int first = 0 ;
        int second = 1;
        System.out.print(first + " " + second + " ");
        for (int i = 0; i < total; i++) {
            int three = first + second;
            System.out.print(three + " ");
            first = second;
            second = three;
        }
    }

    //
//    private  void printFibonacci(int count){
//        int n1=0;
//        int n2=1;
//        int n3=0;
//        System.out.print(n1+" "+n2);//printing 0 and 1
//        printFibonacci(count-2);//n-2 because 2 numbers are already printed
//        if(count>0){
//            n1 = n2;
//            n2 = n3;
//            n3 = n1 + n2;
//            System.out.print(" "+n3);
//            printFibonacci(count-1);
//        }
//    }

    public static void main(String[] args) {
        FinonacciSeries fs = new FinonacciSeries();
        fs.normalMethod(10);

        //fs.printFibonacci(10);

    }
}

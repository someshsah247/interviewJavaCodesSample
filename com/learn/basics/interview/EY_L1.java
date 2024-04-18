package com.learn.basics.interview;

public class EY_L1 {
   // selected.
}

/*

 emp obejects  --> IT department and salary is more then 80K

 emp  -- id, name, salary and department


 List<Emp> newList = list.stream().filter(x->x.getDepartment().equalsIgnoreCase("IT"))
			  .filter(x->x.getSalary > 800000).toList();


 resversString --

 word= "somesh";
 Arrays.stream(word.split("")).map(x->new StringBuffer(x).reverse()).toList();


 // is this code will run or give exception

 public class StartTwice {
    public static void main(String[] args){
        Thread t = new Thread();
        t.start();
        t.start(); // illegal exception
    }
}


 */
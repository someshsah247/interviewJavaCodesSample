package com.learn.basics.exception;

class ExceptionReturnQues{

    static int getException(){
        try{
            System.out.println("try");
            // System.exit(0);  // code execution stop ho jaye ga 
            int x = 10/0;  // error
            // System.exit(0); // code execution nahi ga 
        }catch(Exception ex){
            System.out.println("catch");
            // System.exit(0);  // yaha nahi likh sakte hai  -->  error -- unreachable code. 
            return 5;  // line1
        }finally{
            System.out.println("finally");
            return 10;  // line2
        }
        //return 15; // line3
    }

    /*
        1.  line2 or line3  -- in dono me se koi 1 he line hoga.
                if both line will present then it will give error -- unreachable code.
        2.  all 3 blocks will execute. 
        3.  if return statement present in finally block then finally block return statment will execute.
        4.  if return statement not present in finally block then catch block return statment will execute. 
    */ 


    public static void main(String[] args) {
        System.out.println(getException());
    }
    
}
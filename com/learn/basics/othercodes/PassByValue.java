package com.learn.basics.othercodes;

// https://www.youtube.com/watch?v=w4sGl3HxgZw&list=PLyHJZXNdCXscoyL5XEZoHHZ86_6h3GWE1&index=3&ab_channel=CodeDecode

class Book{
    int book;

    public int getBook() {
        return book;
    }

    public void setBook(int book) {
        this.book = book;
    }

}

public class PassByValue {

    // JAVA is PASS-BY-VALUE

    private static void changeBookValue(Book b){
        // Here we are passing reference (address) -- that why value is changed. -- but still java is pass by value only.
        System.out.println("copyOf book value" + b.getBook());
        b.setBook(b.getBook() * 10);
        System.out.println("new value of book variable" + b.getBook());
    }

    private static void chnageInstanceVariable(int copyOfValue){
        // here we are passing copy of it -- that why value is not change.
        System.out.println("copyOf a" + copyOfValue);
        copyOfValue = copyOfValue * 10;
        System.out.println("new value of a" + copyOfValue);
    }

    public static void main(String[] args) {

        int a = 10 ;
        chnageInstanceVariable(a);
        System.out.println("a -  "+a);
        /*
            copyOf a10
            new value of a100
            a -  10
         */

        Book b = new Book();
        b.setBook(5);
        changeBookValue(b);
        System.out.println("book value - "+b.getBook());
        /*
            copyOf book value5
            new value of book variable50
            book value - 50
         */

    }


}

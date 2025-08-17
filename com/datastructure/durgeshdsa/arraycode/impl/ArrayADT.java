package com.datastructure.durgeshdsa.arraycode.impl;

// This is my own array
public class ArrayADT {

    // variables
    private int array[]; // to store data
    private int size ; //
    private int index; // current last value

    // No need of getter and setters -- as dont want to give access to anyone

    //constructor
    public ArrayADT(){ // default size
        this.array = new int[10];
        this.size = 10;
    }

    public ArrayADT (int capacity){ // with given capacity
        this.array = new int[capacity];
        this.size = this.array.length;
    }

    // methods

    // print all elements of array
    public void showAllElements(){
        for (int i : this.array) {
            System.out.print(i + " ");
        }
    }

    // insert at the end
    public void add(int element){
        if(this.size >= this.index){
            this.array[this.size] = element;
            this.index++;
         } else {
            System.out.println("Array is full");
        }
    }

    // insert at the middle
    public void insert(int element, int position){
        int[] tempArray = new int[array.length +1];
        for (int i = 0; i < this.array.length ; i++) {
            if(i == position){

            } else {

            }
        }

        //System.out.println("Not Yet Implemented");
    }

    // delete code

}

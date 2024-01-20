package com.learn.basics.comparablecode;

public class Teacher implements Comparable {
    
    private int tid;
    private String tname;

    @Override
    public int compareTo(Object o) {
        return this.getTid() - ((Teacher) o).getTid(); // compating based on ID
    }

    public Teacher(){
    }

    public Teacher(int id , String name){
        this.tid = id;
        tname = name;
    }



    //getter method
    public int getTid(){
        return this.tid;
    }
    public String getTname(){
        return this.tname;
    }

    //setter method
    public void setTname(String name){
        this.tname = name;
    }
    public void setTid(int id){
        this.tid = id;
    }

    //to string method 
    public String toString(){
        return "[ "+this.tid +" - "+this.tname +"]";
    }


}

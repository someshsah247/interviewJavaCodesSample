package com.learn.basics.design.pattern.creational.factory;

public class OperatingFactory {

    public OperatingSystem createOs(String os){
        if(os.equals("W"))
            return new WindosOS();

        if(os.equals("L"))
            return new LinixOs();

        return null ; //throw new UnsupportedOperationException();
    }
}

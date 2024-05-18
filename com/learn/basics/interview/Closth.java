package com.learn.basics.interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Nokia round 2
class Cloth{
    private  String  bName;
    Cloth(String bName){
        this.bName = bName;
    }

    public String getBName(){
        return bName;
    }

    @Override
    public String toString(){
        return bName;
    }


}

public class Closth {

    public static void main(String[] args) {
        List<Cloth> list = new ArrayList<>();
        list.add(new Cloth("Joki"));
        list.add(new Cloth("Joki"));list.add(new Cloth("f"));
        list.add(new Cloth("A"));
        list.add(new Cloth("v"));
        System.out.println(list);

        Iterator it = list.iterator();
        while (it.hasNext()){
            Cloth c = (Cloth) it.next();
            if (c.getBName().equals("Joki")){
                //it.remove();
                list.remove(c);
            }
        }

System.out.println(list);

    }

}

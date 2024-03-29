package com.learn.basics.interview;

import java.util.HashMap;
import java.util.Map;

public class Infosys {
    public static void main(String[] args) {
        //System.out.println("working");
        int[] arr = new int[]{45,65,24,98,65,13,47,99,11,43,45};

        //List<Integer> list = Arrays.stream(arr).boxed().distinct().sorted().toList();
        // Arrays.stream(arr).boxed()
        // .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
        // .entrySet().forEach((x) -> System.out.println(x.getKey() + " -- "+ x.getValue()) ); // not able to do in interview. 
        //System.out.println(list);
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }else{
                map.put(arr[i], map.get(arr[i])+1);
            }
        }
        map.forEach((x,y)->System.out.println(x +" -- "+ y ));

    }
}

// m2  -- 

// ww.myname.com
// @Controller
// Class Product{

//     @GettMapping("/v1/getAll/Data")
//     public List<Products> getAllproducts(@Re){

//     }

// }

// @FingeClient(name="Product-Service", url="", )
// interface CallProduxt{

//     @GettMapping("/v1/getAll/Data")
//     public List<Products> getAllproducts(@RequestHader );

// }


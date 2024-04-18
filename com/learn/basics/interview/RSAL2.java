package com.learn.basics.interview;

import java.util.*;

public class RSAL2 {
    public static void main(String[] args) {

//        HashMap<String, Integer> map = new HashMap<>();
//        List<Integer> list  = new ArrayList<>();
//        LinkedHashMap<> lhm = new LinkedHashMap<>();
//
//        for(int i='a'; i<map.size() ; i++){
//            list.add(map.get(i));
//        }
//
//        List sortedList = list.stream().sorted((x,y)->y-x).toList();
//
//        //Map.Entry entry = map.entrySet().stream().reduce()
//
//        for(int i=0; i<sortedList.size() ; i++){
//            if(map.containsValue(sortedList.get(i))) {
//
//                lhm.put(key, sortedList.get(i));
//            }
//        }


//        String word = "someshsah is a very good boy very good";
//
//        String[] words = word.split(" "); //
//
//
//        List list = Arrays.stream(words).distinct().toList();
//       // System.out.println(list.size());
//
//
//        HashMap<String,String>  map = new HashMap<>();
//        for(int i=0; i<list.size() ; i++)
//            map.put(list.get(i).toString(),"");
//
//        System.out.println(map.size());


        int[] arr = new int[]{1,2,3,4,5};
        //0 1 2 3 4

// 1 -- 5,1,2,3,4  --  5-1 = 4
// 2 -- 4,5,1,2,3  --  5 - 2 = 3


        int ittration = 2 ;

        for(int i= arr.length-ittration ;  i<arr.length ; i++ ){
            System.out.print( arr[i]+ " ");
        }

        for(int i= 0 ;  i<arr.length - ittration ; i++ ){
            System.out.print( arr[i] + " ");
        }



    }
}

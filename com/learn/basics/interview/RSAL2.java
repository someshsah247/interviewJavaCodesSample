package com.learn.basics.interview;

import java.util.*;

public class RSAL2 {

    // 80% coding -- cleared 2nd round.
    public static void main(String[] args) {

//  store in sorting order via value
//        ("a", 95);     ("b", 80);
//        ("c", 97);     ("d", 78);
//        ("e", 65);
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

/*


HashMap<Key, Value> map = new HashMap<>(); // 16 buket

map.put("A","A");  hascode --> 8th
map.put("B","B");
map.put("CA","C");
map.put("D","D");

map.forEach((x,y)-> System.out.print(x +" "+y));


class Error{
	privte String erroCode;
	private String errorMsg;
	//getter and setters
}

@RestControllerAdvice
class GlobalExceptionhAndlerClass{

@ExceptionHandler("NullPointerException.class")
public ResponseEntity<Errro> getNullPointerException( String methodName){
	Error e = new Error();
	e.setErrorMsg("NullPointerException in "+methodName);
	e.setErrorCode("BE-404");

	return ResponseEntity.ok()

}


Class MyThread impliments Runnable{

@override
public void run(){
// some task
}

 psvm(){

 Thread t = new Thread();
 t.strat();

 }

}

		("a", 95);
		("b", 80);
		("c", 97);
		("d", 78);
		("e", 65);

HashMap<String, Integer> map = new HashMap<>();
List<Integer> list  = new ArrayList<>();
LinkedHashMap<> lhm = new LinkedHashMap<>();

for(int i='a' i<map.size() ; i++){
	list.add(map.get(i));
}

List sortedList = list.stream().sorted((x,y)->y-x).toList();

for(int i=0 i<sortedList.size() ; i++){
	int key = map.getKey(sortedList.get(i));
	lhm.put(key, value)
}


String word = "someshsah is a very good boy very good";

String[] words = word.split(" "); //

List list = Arrays.stream(words).duplicate().toList();
SOp(list.size());

HashMap<String,String>  map = new HashMap<>();
for(int i=0 i<list.size() ; i++)
	map.put(list.get(i),"");

sop(map.size());



int[] arr = new int[]{1,2,3,4,5};
					  0 1 2 3 4

// 1 -- 5,1,2,3,4  --  5-1 = 4
// 2 -- 4,5,1,2,3  --  5 - 2 = 3


int ittration = 1 ;

for(int i= arr.legth()-ittration ;  i<arr.legth() ; i++ ){
	SOP();

}


 */
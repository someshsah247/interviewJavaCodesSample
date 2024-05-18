//package com.learn.basics.interview;
//
//
//import java.util.*;
//
//@FunctionalInterface
//interface StudentFee{
//    int dueFee(int fee);
//}
//
//public class Nokia2 {
////    static List<String> listHobbies  = new ArrayList<>();
////    // cricket
////    private static void addHoobi(String hobi){
////        listHobbies.add(hobi);
////    }
////
////    private static void removeHoobi(String hobi){
////        if(listHobbies.contains(hobi)) { // System.out.println("Remove Hobbi");
////            if(listHobbies.size()==1)
////                System.out.println("Please keep some hobbis");
////            listHobbies.remove(hobi);
////        }
////    }
////
////    private static void updatehobb(String oldHobbi , String newHobbi){
////        if(listHobbies.contains(oldHobbi)){
////            listHobbies.add(newHobbi);
////            listHobbies.remove(oldHobbi);
////        }
////    }
////
//    // Add , remove , update , delelet ,
//    static  HashSet<String>  hs = new HashSet<>();
//
//    public static void addHobb(int numberOfHobbis){ // 3
//        Scanner sc = new Scanner(System.in);
//        if(numberOfHobbis>0) {
//            for (int i = 0; i < numberOfHobbis; i++) {
//                hs.add(sc.next());
//            }
//        }else
//            System.out.println("please enter valide number");
//    }
//
//    public void updateHobb(String hobb){
//       if( hs.contains(hobb)){
//           hs.remove(hobb);
//       }
//    }
//
//    public static void removeHobb(int numberOfHobbis){
//        Scanner sc = new Scanner(System.in);
//        if(numberOfHobbis>0) {
//            for (int i = 0; i < numberOfHobbis; i++) {
//                String hobi = sc.next();
//                if(hs.contains(hobi)){
//                    hs.remove(hobi);
//                }
//            }
//            System.out.println("Hobi removed");
//
//        }else
//            System.out.println("please enter valide number");
//    }
//
//    public void updateHibi(int numberOfHobbis ){
//        Scanner sc = new Scanner(System.in);
//        if(numberOfHobbis>0) {
//            for (int i = 0; i < numberOfHobbis; i++) {
//                String oldhobi = sc.next();
//                String newhobi = sc.next();
//                if(hs.contains(oldhobi)){
//                    hs.remove(oldhobi);
//                    hs.add(newhobi);
//                }
//            }
//            System.out.println("Hobi update");
//        }else
//            System.out.println("please enter valid number");
//    }
//
//    public static void deleteAll(){
//            hs.clear();
//    }
//
//    public static void getAllHobi(){
//            System.out.println(hs);
//    }
//
//    class cloth{
//        privtae String bName ;
//
//    }
//
//    List<Cloth> list = new ArrayList<>();
//    Iterator it = list.iterator();
//    while(it.hasNext()){
//        if(it.next().equals())
//    }
//
//
//
//
//
//
//
//
//
//
////    private static boolean checkHoobi(List listHobbiess){
////        if(listHobbies.size()==1){
////            System.out.println("Please keep some hobbis");
////            return false;
////        }
////        return true;
////    }
//
//
//    public static void main(String[] args) {
////        int totalfee =100;
////        StudentFee sf = (x)-> totalfee-x;
////        System.out.print(sf.dueFee(70));
////some
//
////        Scanner sc = new Scanner(System.in);
////        int x = sc.nextInt();
////        switch (x){
////            case 1 : System.out.println("Add Hobbi");
////                     addHoobi(sc.next());
////            case 2 : System.out.println("Remove Hobbi");
////                    removeHoobi(sc.next());
////            default:   System.out.println("PLEASE TRY AGAIN");
////        }
//
//        //Nokia2 n = new
//        addHobb(3);
//        getAllHobi();
//        System.out.println("delete");
//        removeHobb(1);
//        getAllHobi();
//        removeHobb(1);
//        addHobb(2);
//        getAllHobi();
//
//
//
//
//    }
//
//}
//


/*
A, B, C classes
    A --> m1(),
    B --> m1(), m2()  --> class B extends A{}
    C --> m1(), m2(), m3()  --> class C extends B{}

	A ref =new A();
    ref.m1();
    ref.m2();
    ref.m3();

    C ref = new B(); // downcase
	B ref = new C();
    ref.m1();
    ref.m2();
    ref.m3();//


    C ref = new C(); //
    ref.m1();
    ref.m2();
    ref.m3();

	A a = new C();

	Emp{
	private String name;

	Emp(String name){
		this.name = name;
	}
	}

	@FunctionalInterface
	interface StudentFee{
		int dueFee(int fee);
	}


	int totalFee = 100;
	StudentFee sf = (x,y)-> y=totalFee-x;


	//


	multi threading --
	File handing =--

	Oops -- breush up

 */

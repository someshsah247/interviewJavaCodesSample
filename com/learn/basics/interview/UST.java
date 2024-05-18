package com.learn.basics.interview;

public class UST {
    public static void main(String[] args) {

    }
}
/*
list emp  == {};
emp == id, list[phoneNUmbers] , dpt, name
 --

 emp.stream().flatMap(x->x.getPhoneNumber()).collect(Collects.toList());
 // name ==> dpt
 //emp.stream().sorted((x,y)-> if(x.getName().equals(y.getName()))


 Collections.sort(Emp,EmpName);
 public EmpName impliments Comparator{

 }

 int compaireTo(emp e){

	retun

	if(this.name().equals(e.getName())){
		retun this.dpt - e.getDpt();
		}
	else
		this.name() - e.getName()	;

 }

 Book{
 private String bookName;
 private Integer bookId;
 @ManyToMany
 private List<Auther> bookAuth;
 }

  Auth{
 private String authName;
 private Integer userId;

 @ManyToMany
 @JoinColumn( @Join{"bookAuth", mappedBy="bookAuth" })
 private List<Book> books;
 }


 */

package com.learn.basics.interview;

public class QBurst {
    public static void main(String[] args) {
        //System.out.println("Working");
    }

}

/*
public class ExceptionTest {
  public static void main(String[] args) {
   System.out.println(exceptionTest());
  }
  public static int exceptionTest()
  {
   int i=6;
   try{
    throw new NullPointerException();
   }
   catch(NullPointerException e)
   {
    i=10;
    throw e;
   }
   finally
   {
    i=20;
    System.out.println("In finally block");
    return i;
   }
  }
}
 */

/*
Class Country {

private String name;
private String capital;
private Double area;
private long population;

// getter
// setter



}

Country india = new Country ("name",);
Country usa = new Country ();

india.equals(usa)
 */

/*
id|name    |science|maths|social|
--+--------+-------+-----+------+
 2|Max Ruin|     56|   85|    85|
 3|Arnold  |    170|   40|    75|
 4|Krish   |     50|   70|    60|
 5|John    |     80|   90|    60|


 student --

 selelect max(total) from (
	 select s.name,sum() as total from student s
	 group by s.name
 ) temp;

 */
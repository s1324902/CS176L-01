/**
   A person is represented by the name and a birth year.
   You must enter the class name, instance variable(s), and constructor below
*/

   public class Person{
	   private String name;
	   private int birthYear;
	   
	   public Person(String n, int d){
		   name = n;
		   birthYear = d;
	   }
	   

/**
      Returns the string representation of the object.
      @return a string representation of the object
*/


   public String toString() {
      return "Person[name=" + name + ",birthYear=" + birthYear + "]";
   }
}
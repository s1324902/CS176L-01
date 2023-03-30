/**
   A student is represented by the name, birth year, and major.
   You must enter the class name, instance variable(s), and constructor below
*/

public class Student extends Person{
	private String major;
	
	public Student (String name, int birthYear, String m){	
	super(name, birthYear);
	m = major;

}

   /**
      Returns the string representation of the object.
      @return a string representation of the object
   */
   public String toString()
   {
      return "Student[super=" + super.toString() + ",major=" + major + "]";
   }
}

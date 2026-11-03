public class Student extends Person
{
   //data fields
   protected double gpa;
   protected String gNum, classes[];
   
   //constructors
   public Student(String name, String gender, String dob, double gpa)
   {
      super(name, gender, dob);     //invokes constructor of superclass
      this.gpa = gpa;
   }
}
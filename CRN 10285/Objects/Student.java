import java.util.GregorianCalendar;

public class Student
{
   //data fields
   private String name, major, gender;
   private int age;
   private boolean onlyChild;
   private GregorianCalendar dob;
   
   //constructors
   public Student(String name, String maj)
   {
      this.name = name;
      this.major = maj;
   }
   
   public Student(String name, int age)
   {
      this.name = name;
      this.age = age;
   }
}
import java.util.GregorianCalendar;

public class Student
{
   //data fields
   private String name, address, ssn, classes[], id, gender;
   private int age, familySize;
   private double income;
   private GregorianCalendar dob;
   
   //constructors   
   public Student(String a, String id)
   {
      this.name = a;
      this.id = id;
   }
   
   public Student(String name, int age)
   {
      this.name = name;
      this.age = age;
   }
   
   public Student(String name, String address, String gender)
   {
      this.name = name;
      this.address = address;
      this.gender = gender;
   }
   
   public Student(double income, GregorianCalendar dob)
   {
      this.income = income;
      this.dob = dob;
   }
}
public class Student
{
   //data fields
   private String name, gender;
   private int age;
   private char[] grades;
   private double gpa;
   
   //constructors
   public Student(String n, String g, int a)
   {
      this.name = n;
      this.gender = g;
      this.age = a;
   }
   
   //methods
   public void setGrades(char[] g)
   {
      this.grades = g;
   }
   
   public void setName(String n)
   {
      this.name = n;
   }
   
   public double getGPA()
   {
      calcGPA();        //invoke calcGPA
      return this.gpa;
   }
   
   private void calcGPA()
   {
      if( this.grades == null )
         System.out.println( "Grades are missing." );
      else
      {   
         double sum = 0;
         for( int i = 0; i < this.grades.length; i++ )
         {
            char grade = this.grades[i];
            if( grade == 'A' || grade == 'a' )
               sum = sum + 4.0;
            if( grade == 'B' || grade == 'b' )
               sum = sum + 3.0;
         }
         
         this.gpa = sum/this.grades.length;
      }
   }
   
   public String toString()
   {
      return "Name: " + this.name + "\nAge: " + this.age;
   }
}
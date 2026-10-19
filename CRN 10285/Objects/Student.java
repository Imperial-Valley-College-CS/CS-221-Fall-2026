import java.util.GregorianCalendar;

public class Student
{
   //data fields
   private String name, major, gender, id;
   private int age;
   private boolean onlyChild;
   private GregorianCalendar dob;
   private double height, weight, gpa;
   private char[] grades;
   
   //constructors
   public Student(String name, String gender, String dub)
   {
      this.name = name;
      this.gender = gender;
      setDOB( dub );
   }
   
   public Student(String name)
   {
      this.name = name;
   }
   
   //methods
   public void setID(String i)
   {
      this.id = i;
   }
   
   public void setName(String n)
   {
      this.name = n;
   }
   
   public void setWeight( double w )
   {
      this.weight = w;
   }
   
   public void setHeight( double h )
   {
      this.height = h;
   }
   
   public void setGrades( char[] g )
   {
      this.grades = g;
   }
   
   public String getName()
   {
      return this.name;
   }
   
   public double getGPA()
   {
      calcGPA();
      return this.gpa;
   }
   
   private void setDOB( String date )
   {
      String[] tokens = date.split("-");        //{"3", "15", "2023"}
      int year = Integer.parseInt(tokens[2]);
      int month = Integer.parseInt(tokens[0])-1;
      int day = Integer.parseInt(tokens[1]);
      this.dob = new GregorianCalendar( year, month, day );
   }
   
   private void setAge()
   {
      GregorianCalendar today = new GregorianCalendar();    //captures current date
      long timeInMillis = today.getTimeInMillis() - this.dob.getTimeInMillis();
      
      
      long timeInSeconds = timeInMillis/1000;    //time in seconds
      long timeInMinutes = timeInSeconds/60;     //time in minutes
      long timeInHours = timeInMinutes/60;       //time in hours
      long timeInDays = timeInHours/24;         //time in days
      //this.age = (int)( (double)timeInDays/365.24 );     //time in years
      
      this.age = (int)((double)(timeInMillis)/(1000*60*60*24*365.24));
   }
   
   private void calcGPA()
   {
      if(this.grades == null)
      {
         System.out.println("Grades are missing.");
      }else{
         double sum = 0;
         for( int i = 0; i < this.grades.length; i++ )
         {
            switch(this.grades[i])
            {
               case 'A': case 'a': sum = sum + 4.0; break;
               case 'B': case 'b': sum = sum + 3.0; break;
               case 'C': case 'c': sum = sum + 2.0; break;
               case 'D': case 'd': sum = sum + 1.0; break;
            }         
         }
         this.gpa = sum/this.grades.length;
      }
   }
}
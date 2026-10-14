import java.util.GregorianCalendar;

public class Student
{
   //data fields
   private String name, major, gender;
   private int age;
   private boolean onlyChild;
   private GregorianCalendar dob;
   private double height, weight;
   
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
      this.age = (int)( (double)timeInDays/365.24 );     //time in years
   }
}
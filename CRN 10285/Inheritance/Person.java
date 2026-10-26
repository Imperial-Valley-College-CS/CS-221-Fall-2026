import java.util.GregorianCalendar;
import javafx.scene.paint.Color;

public class Person
{
   //data fields
   private String name, gender, race, nationalities[], ethnicity;
   private int age, weight, heightInches;
   private GregorianCalendar dob;
   private Color eyeColor, hairColor;
   
   //constructors
   public Person(String name, String gender, String d)
   {
      this.name = name;
      this.gender = gender;
      setDOB(d);
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
   
   public int getAge()
   { 
      setAge();
      return this.age; 
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
   
   @Override
   public String toString()
   {
      return "Name: " + this.name + "\nAge: " + getAge();
   }
}
import java.util.GregorianCalendar;
import javafx.scene.paint.Color;

public class Person
{
   //data field
   private String name, gender;
   private int age, heightInches;
   private double weight;
   private GregorianCalendar dob;
   private Color eyeColor, hairColor;
   
   //constructor(s)
   public Person( String n, String g, String dub )
   {
      this.name = n;
      this.gender = g;
      setDOB(dub);
   }
   
   //methods
   private void setDOB(String date)
   {
      //splits string at the hyphens into an array of Strings {"5", "15", "1928"}
      String[] arr = date.split("-");     
      int month = Integer.parseInt( arr[0] ) - 1;     //make "5" into 5 and subtract 1
      int day = Integer.parseInt( arr[1] );           //make "15" into 15
      int year = Integer.parseInt( arr[2] );          //make "1928" into 1928
      this.dob = new GregorianCalendar(year, month, day);
   }
   
   @Override
   public String toString()
   {
      return "Name: " + this.name + "\nGender: " + this.gender;
   }
}
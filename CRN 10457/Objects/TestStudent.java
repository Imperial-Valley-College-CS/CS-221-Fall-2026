import java.util.GregorianCalendar;

public class TestStudent
{
   public static void main(String[] args)
   {
      Student s1 = new Student("Princess Leia", "G00933333");
      Student s2 = new Student("Han Solo", "G00453233");
      Student s3 = new Student("Jalen Hurts", 26);
      Student s4 = new Student("Toby Ortiz", "16 W. Steer", "male");
      
      GregorianCalendar someBirthday = new GregorianCalendar(2009, 9, 13);
      Student s5 = new Student(80526.0, someBirthday);
   }
}
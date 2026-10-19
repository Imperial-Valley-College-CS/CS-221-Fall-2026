import java.util.GregorianCalendar;

public class TestStudents
{
   public static void main(String[] args)
   {
      Student s1 = new Student("Olivia Ortiz", "female", "3-15-2023");
      char[] g = {'A','b','c','A'};
      s1.setID("G00305451");
      System.out.println( s1.getName() );
      s1.setName("Olivia Sanchez");
      System.out.println( s1.getName() );
      s1.setGrades(g);
      System.out.println( s1.getGPA() );
      
   }
}
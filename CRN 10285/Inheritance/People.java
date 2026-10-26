public class People
{
   public static void main(String[] args)
   {
      Person p = new Person("Lisa Lopez", "female", "10-26-2006");
      Student s = new Student("Joe Gonzalez", "male", "10-27-2006");
      System.out.println( p );      //prints what toString returns
      System.out.println( s );      //prints what toString returns
   }
}
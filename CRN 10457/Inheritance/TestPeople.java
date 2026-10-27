public class TestPeople
{
   public static void main(String[] args)
   {
      Person p = new Person("Minerva Mouse", "female", "5-15-1928");
      Employee e = new Employee("Michael Mouse", "male", "5-15-1928", "Actor");
      System.out.println( p );
      System.out.println( e );
   }
}
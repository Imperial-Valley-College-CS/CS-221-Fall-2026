public class Employee extends Person
{
   private String jobTitle;
   
   //constructors
   public Employee( String n, String g, String dub, String title)
   {
      super(n,g,dub);      //invokes constructor of superclass
      this.jobTitle = title;
   }
}
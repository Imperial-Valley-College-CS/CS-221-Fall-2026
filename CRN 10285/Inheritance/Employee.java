public class Employee extends Person
{
   //data fields
   protected double salary;
   protected String jobTitle;
   
   //constructors
   public Employee( String name, String gender, String dob, String jobT )
   {
      super(name, gender, dob);
      this.jobTitle = jobT;
   }
   
   //methods
   @Override
   public String toString()
   {
      return "Name: " + super.name + "\nJob Title: " + this.jobTitle;
   }
}
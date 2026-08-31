import java.util.Scanner;

public class ValidEmail
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter full name: ");
      String yourName = scan.nextLine().toLowerCase();      
      
      System.out.print("Enter valid email: ");
      String email = scan.nextLine();
      
      char firstI = yourName.charAt(0);         //this grabs the first initial from yourName
      int space = yourName.indexOf(' ');
      String lastN = yourName.substring(space+1);
      String domain = "@students.imperial.edu";
      
      String validE = firstI + "." + lastN + domain;
      
      boolean valid = email.equals(validE);
      
      System.out.println( "Email is valid: " + valid );
      scan.close();
   }
}
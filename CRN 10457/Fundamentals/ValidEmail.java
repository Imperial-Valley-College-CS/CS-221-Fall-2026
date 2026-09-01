import java.util.Scanner;

public class ValidEmail
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter your full name: ");
      String name = scan.nextLine().toLowerCase();
      
      System.out.print("Enter a valid email: ");
      String email = scan.nextLine().toLowerCase();
      
      int space = name.indexOf(' ');
      int dot = email.indexOf('.');
      int at = email.indexOf('@');
      String lastN = name.substring(space+1);
      String strDotAt = email.substring(dot+1, at);
      
      boolean hasFirstI = (name.charAt(0) == email.charAt(0));
      boolean hasLastName = lastN.equals(strDotAt);
      boolean endWithDomain = email.endsWith("@students.imperial.edu");
      
      boolean validEmail = (hasFirstI && hasLastName && endWithDomain );
      
      System.out.println("Email is valid: " + validEmail);
      
   }
}
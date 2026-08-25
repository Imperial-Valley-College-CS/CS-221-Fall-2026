import java.util.Scanner;

public class FirstLastName
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter your full name (first & last): ");
      String yourName = scan.nextLine();
      
      int space = yourName.indexOf(' ');
      String fName = yourName.substring(0,space);
      String lName = yourName.substring(space+1);
      
      System.out.println( fName );
      System.out.println( lName );
      
   }
}
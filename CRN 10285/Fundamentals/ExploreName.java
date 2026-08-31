import java.util.Scanner;

public class ExploreName
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter first and last name: ");
      String name = scan.nextLine();
      
      int space = name.indexOf(' ');
      String fName = name.substring(0,space);
      String lName = name.substring(space+1);
   }
}
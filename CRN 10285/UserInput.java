 import java.util.Scanner;
 
 public class UserInput
 {
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("What is your name? ");
      String yourName = scan.nextLine();
      
      System.out.print("How old are you? ");
      int yourAge = scan.nextInt();
      
      System.out.print("Are you an only child (true/false)? ");
      boolean isOnlyChild = scan.nextBoolean();
      
      System.out.println( yourName );
      System.out.println( yourAge );
      System.out.println( isOnlyChild );
      
   }
 }
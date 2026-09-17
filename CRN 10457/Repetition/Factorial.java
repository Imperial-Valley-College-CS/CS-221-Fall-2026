import java.util.Scanner;

public class Factorial
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
           
      System.out.print("Enter a number between 1 and 10: " );
      int num = scan.nextInt();
      
      while( num > 10 || num < 1)
      {
         System.out.print("Enter a number between 1 and 10: " );
         num = scan.nextInt();
      }
      
      int fact = 1;
      
      for( int i = num; i > 1; i-- )
      {
         fact = fact*i;
      }
      
      System.out.println( num + " factorial is " + fact );
      
   }
}
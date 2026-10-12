import java.util.Scanner;

public class Factors
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter a number: ");
      int num = scan.nextInt();
      
      System.out.print("Factors: ");
      String factors = "";
      int sumFactors = 0;
      
      int i = 1;
      while( i <= num/2 )
      {
         if( num % i == 0 )
         {
            sumFactors = sumFactors + i;
            factors = factors + i + " + ";
         }
            
         i++;
      }
      
      if( num == sumFactors )
      {
         System.out.print( factors.substring(0,factors.length()-3) );
         System.out.print( " = " + sumFactors );
      }else
      {
         System.out.println(num + " is not a perfect number.");
      }
   }
}
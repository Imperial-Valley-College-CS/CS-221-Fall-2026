import java.util.Scanner;

public class UnitCoverters
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter a temperature in degF: " );
      double tempF = scan.nextDouble();
      double temp = fahrenheit2Celsius(tempF);
      System.out.println( temp );
      double temp1 = fahrenheit2Celsius( 102 );
      System.out.println( temp1 );
   }
   
   public static double fahrenheit2Celsius( double tempF )
   {
      double tempC = (5.0/9.0)*(tempF-32);
      return tempC;
   }
   
   public static void miles2km( double miles )
   {
      return 1.609*miles;
   }
}
import java.util.Scanner;

public class UnitConverter
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter a temp in degF to convert: ");
      double temp = scan.nextDouble();
      
      System.out.println( fahToCel(temp) );      
   }
   
   public static double fahToCel(double tempF)
   {
      return (5.0/9.0)*(tempF-32);
   }
}
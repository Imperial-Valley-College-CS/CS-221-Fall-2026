import java.util.Scanner;

public class DistanceFormula
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter location x1: ");
      double x1 = scan.nextDouble();
      System.out.print("Enter location y1: ");
      double y1 = scan.nextDouble();
      System.out.print("Enter location x2: ");
      double x2 = scan.nextDouble();
      System.out.print("Enter location y2: ");
      double y2 = scan.nextDouble();
      
      double aa = Math.pow(x2-x1,2);
      double bb = Math.pow(y2-y1,2);
      double c = Math.sqrt( aa + bb );
      
      System.out.print("The distance between (x1,y1) and (x2,y2) is " + c + " units.");
   }
}
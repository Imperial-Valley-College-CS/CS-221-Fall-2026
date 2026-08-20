import java.util.Scanner;

public class UserInput
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("How old are you? ");
      int yourAge = scan.nextInt();             //use nextInt to scan as integer
      //System.out.print( yourAge );
      System.out.print("How many siblings do you have? ");
      int numSib = scan.nextInt();
      //System.out.print(numSib);
      System.out.print("What is your name? ");
      String yourName = scan.next();
      System.out.print("How much do you weigh? ");
      double weight = scan.nextDouble();
   }
}
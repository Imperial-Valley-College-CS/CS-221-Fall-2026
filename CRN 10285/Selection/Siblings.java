import java.util.Scanner;

public class Siblings
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("How many siblings do you have? ");
      int numSib = scan.nextInt();
      
      if( numSib > 0 )
      {
         System.out.print("How many brothers do you have? ");
         int numBros = scan.nextInt();
         System.out.print("How many sisters do you have? ");
         int numSis = scan.nextInt();
         
         System.out.println("You have " + numBros + " brothers. And " + numSis + " sisters.");
         
      }else
      {
         System.out.println("You are an only child.");
      }
      
   }//end main
}//end class
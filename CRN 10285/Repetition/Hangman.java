import java.util.Scanner;

public class Hangman
{
   public static void main(String[] args)
   {
      //create Scanner object and import Scanner class
      Scanner scan = new Scanner(System.in);
      String word = "summer";
      String guess = "++++++";
      
      while( !word.equals(guess) )
      {
         //ask for a letter
         System.out.print("Guess a letter ");
         //scan letter
         char let = scan.nextLine().charAt(0);
         
         String empty = "";
         int len = word.length();
         //write a loop that will traverse word
         for(int i = 0; i < len; i++)
         {
            if( word.charAt(i) == let )
               empty = empty + let;
            else
               empty = empty + guess.charAt(i);
         }
         //update guess to equal empty
         guess = empty;
         System.out.println( "Guess: " + guess );
      }
   }
}